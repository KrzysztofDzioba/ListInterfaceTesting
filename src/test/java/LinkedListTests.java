import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTests {

    //add(E obj)
    public static void shouldAddOneObjectToList() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        //when
        linkedList.add(1);
        //then
        assert linkedList.size() == 1 : "Adding objects doesnt work properly";
    }

    //add(int index, E obj)
    public static void shouldAddObjectOnSpecificPosition() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        //when
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1, 2);
        //then
        assert linkedList.get(1) == 2: "Error";
    }

    //addAll(Collection<? extends E> c)
    public static void addOtherCollectionToExistingCollection() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);

        List<Integer> secondList = new LinkedList<>();
        secondList.add(2);
        secondList.add(3);

        //when
        linkedList.addAll(secondList);

        //then
        assert linkedList.get(2) == 2 : "Error";
        assert linkedList.get(3) == 3 : "Error";
    }

    // boolean addAll(int index, Collection<? extends E> c);
    public static void addCollectionAtSpecificIndex() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);

        List<Integer> secondList = new LinkedList<>();
        secondList.add(2);
        secondList.add(3);

        //when
        linkedList.addAll(1, secondList);

        //then
        assert linkedList.get(1) == 2 : "Error";
        assert linkedList.get(0) == 0 : "Error";
    }

    //clear();
    public static void afterClearingCollectionIsEmpty() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        //when
        linkedList.clear();
        //then
        assert linkedList.size() == 0 : "Error";
    }

    //boolean contains(Object o);
    public static void checkWhetherListContainsSpecificObject() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        Boolean contains;
        //when
        contains = linkedList.contains(5);
        //then
        assert contains : "Error";
    }

    //boolean containsAll(Collection<?> c);
    public static void containsAllElementsOfPassedCollection() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> newList = simpleLinkedListWithBasicValues();
        linkedList.addAll(newList);
        Boolean containsAll;
        //when
        containsAll = linkedList.containsAll(newList);
        //then
        assert containsAll : "containsAllElementsOfPassedCollection() failed";
    }

    //boolean equals(Object o);
    public static void listIsEqualWithAnotherIfTheyHaveSameObjectsInside() {
        //given
        List<Integer> linkedList = simpleLinkedListWithBasicValues();
        List<Integer> linkedList2 = simpleLinkedListWithBasicValues();
        Boolean equals;
        //when
        equals = linkedList.equals(linkedList2);
        //then
        assert equals : "Test not passed in linkedList (equals)";
    }

    // E get(int index);
    public static void givesElementOfSpecifiedPosition() {
        //given
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        Integer value;
        //when
        value = linkedList.get(0);
        //then
        assert value == 1 : "Test not passed in linked list";
    }



















    private static LinkedList<Integer> simpleLinkedListWithBasicValues() {
        return new LinkedList<>(Arrays.asList(1,2,3));
    }

}
