import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class Tests {
    private static List<Integer> arrayList;
    private static List<Integer> linkedList;

    private static ExecutorService executor = Executors.newFixedThreadPool(5);

    static int failedTests = 0;
    static int passedTests = 0;

    public static void main(String[] args) {
        runTests();
    }

    private static void runTests() {
        List<Future<?>> futures = new ArrayList<>();
        Method[] myTests = ListTests.class.getMethods();
        Stream.of(myTests)
                .filter(m -> Modifier.isStatic(m.getModifiers()))
                .forEach(s -> {
                    Tests.createEmptyLists();
                    futures.add(runTestInNewThread(s, arrayList));
                    futures.add(runTestInNewThread(s, linkedList));
                    Tests.createEmptyLists();
        });
        executor.shutdown();
        int counter = 0;
        for(;;) {
            for(Future<?> future : futures){
                if(!future.isDone())
                    counter ++; // check if future is done
            }
            if(counter == 0)
                break;
            counter = 0;
        }

        System.out.println("Finished all tests");
        System.out.println("Passed tests: " + "\u001B[32m" + passedTests);
        System.out.println("\u001B[0m" + "Failed tests: " + "\u001B[31m" + failedTests);
    }

    private static void createEmptyLists() {
        Tests.arrayList = new ArrayList<>();
        Tests.linkedList = new LinkedList<>();
    }

    private static Future<?> runTestInNewThread(Method m, List<Integer> list) {
        TestThread newThread = new TestThread(m, list);
        return executor.submit(newThread);
    }
}
