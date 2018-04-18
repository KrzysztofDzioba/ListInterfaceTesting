import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

public class TestThread extends Thread {
    private Method m;
    private List<Integer> list;

    private static final Logger LOGGER = Logger.getLogger(ListTests.class.getName() );

    public TestThread(Method m, List<Integer> list) {
        this.m = m;
        this.list = list;
    }

    @Override
    public void run() {
        try {
            m.invoke(null, list);
            Tests.passedTests++;
        } catch (IllegalAccessException e) {
            LOGGER.warning(String.format("Test method '%s' has failed. List type: %s. \n", m.getName(), list.getClass().getName()));
            Tests.failedTests++;
        } catch (InvocationTargetException e) {
            LOGGER.warning(String.format("Test method '%s' has failed. List type: %s. \n", m.getName(), list.getClass().getName()));
            Tests.failedTests++;
        }
    }
}
