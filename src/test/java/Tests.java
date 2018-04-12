import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Tests {
    private static List<Integer> arrayList;
    private static List<Integer> linkedList;

    public static void main(String[] args) {
        runArrayListTests();
    }

    private static void runArrayListTests() {
        Tests.createEmptyLists();

        ListTests.shouldAddOneObjectToList(arrayList);
        ListTests.shouldAddOneObjectToList(linkedList);
        Tests.createEmptyLists();

        ListTests.shouldAddObjectOnSpecificPosition(arrayList);
        ListTests.shouldAddObjectOnSpecificPosition(linkedList);
        Tests.createEmptyLists();

        ListTests.addArrayListToExistingCollection(arrayList);
        ListTests.addArrayListToExistingCollection(linkedList);
        Tests.createEmptyLists();

        ListTests.addCollectionAtSpecificIndex(arrayList);
        ListTests.addCollectionAtSpecificIndex(linkedList);
        Tests.createEmptyLists();

        ListTests.afterClearingCollectionIsEmpty(arrayList);
        ListTests.afterClearingCollectionIsEmpty(linkedList);
        Tests.createEmptyLists();

        ListTests.checkWhetherListContainsSpecificObject(arrayList);
        ListTests.checkWhetherListContainsSpecificObject(linkedList);
        Tests.createEmptyLists();

        ListTests.containsAllElementsOfPassedCollection(arrayList);
        ListTests.containsAllElementsOfPassedCollection(linkedList);
        Tests.createEmptyLists();

//        Stream.of(arrayList, linkedList).forEach(l -> {
//            ListTests.shouldAddOneObjectToList(l);
//            Tests.createEmptyLists();
//            ListTests.shouldAddObjectOnSpecificPosition(l);
//            Tests.createEmptyLists();
//            ListTests.addArrayListToExistingCollection(l);
//            Tests.createEmptyLists();
//            ListTests.addCollectionAtSpecificIndex(l);
//            Tests.createEmptyLists();
//            ListTests.afterClearingCollectionIsEmpty(l);
//            Tests.createEmptyLists();
//            ListTests.checkWhetherListContainsSpecificObject(l);
//            Tests.createEmptyLists();
//            ListTests.containsAllElementsOfPassedCollection(l);
//            Tests.createEmptyLists();
//            ListTests.listIsEqualWithAnotherIfTheyHaveSameObjectsInside(l);
//            Tests.createEmptyLists();
//            ListTests.givesElementOfSpecifiedPosition(l);
//            Tests.createEmptyLists();
//            ListTests.returnIndexOfFirstOccurrenceOfElement(l);
//            Tests.createEmptyLists();
//            ListTests.returnsTrueIfListIsEmpty(l);
//            Tests.createEmptyLists();
//            ListTests.returnsFalseIfListIsNotEmpty(l);
//            Tests.createEmptyLists();
//
//                });
    }

    private static void createEmptyLists() {
        Tests.arrayList = new ArrayList<>();
        Tests.linkedList = new LinkedList<>();
    }
}
