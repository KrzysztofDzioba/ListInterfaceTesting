public class Tests {
    public static void main(String[] args) {
        runArrayListTests();
        runLinkedListTests();
    }

    private static void runArrayListTests() {
        ArrayListTests.shouldAddOneObjectToList();
        ArrayListTests.shouldAddObjectOnSpecificPosition();
        ArrayListTests.addOtherCollectionToExistingCollection();
        ArrayListTests.addCollectionAtSpecificIndex();
        ArrayListTests.afterClearingCollectionIsEmpty();
        ArrayListTests.checkWhetherListContainsSpecificObject();
        ArrayListTests.containsAllElementsOfPassedCollection();
        ArrayListTests.listIsEqualWithAnotherIfTheyHaveSameObjectsInside();
        ArrayListTests.givesElementOfSpecifiedPosition();
        ArrayListTests.returnIndexOfFirstOccurrenceOfElement();

    }

    private static void runLinkedListTests() {
        LinkedListTests.shouldAddOneObjectToList();
        LinkedListTests.shouldAddObjectOnSpecificPosition();
        LinkedListTests.addOtherCollectionToExistingCollection();
        LinkedListTests.addCollectionAtSpecificIndex();
        LinkedListTests.afterClearingCollectionIsEmpty();
        LinkedListTests.checkWhetherListContainsSpecificObject();
        LinkedListTests.containsAllElementsOfPassedCollection();
        LinkedListTests.listIsEqualWithAnotherIfTheyHaveSameObjectsInside();
        LinkedListTests.givesElementOfSpecifiedPosition();
        LinkedListTests.returnIndexOfFirstOccurrenceOfElement();

    }
}
