public class Tests {
    public static void main(String[] args) {
        runArrayListTests();
        runLinkedListTests();
    }

    private static void runArrayListTests() {
        ArrayListTests arrayListTests = new ArrayListTests();
        ArrayListTests.testAddObject();
        ArrayListTests.testAddObjectOnSpecificPosition();
        ArrayListTests.addAllCollection();
        ArrayListTests.addCollectionAtSpecificIndex();

    }

    private static void runLinkedListTests() {
        LinkedListTests linkedListTests = new LinkedListTests();
        LinkedListTests.testAddObject();
        LinkedListTests.testAddObjectOnSpecificPosition();
        LinkedListTests.addAllCollection();
        LinkedListTests.addCollectionAtSpecificIndex();

    }
}
