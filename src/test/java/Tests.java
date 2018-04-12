public class Tests {
    public static void main(String[] args) {
        runArrayListTests();
        runLinkedListTests();
    }

    private static void runArrayListTests() {
        ArrayListTests.testAddObject();
        ArrayListTests.testAddObjectOnSpecificPosition();
        ArrayListTests.addAllCollection();
        ArrayListTests.addCollectionAtSpecificIndex();
        ArrayListTests.testClear();
        ArrayListTests.testContains();
        ArrayListTests.testContainsAll();

    }

    private static void runLinkedListTests() {
        LinkedListTests.testAddObject();
        LinkedListTests.testAddObjectOnSpecificPosition();
        LinkedListTests.addAllCollection();
        LinkedListTests.addCollectionAtSpecificIndex();
        LinkedListTests.testClear();
        LinkedListTests.testContains();
        LinkedListTests.testContainsAll();

    }
}
