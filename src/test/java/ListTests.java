import java.util.ArrayList;
import java.util.List;

public class ListTests {

    //add(E obj)
    public static void shouldAddOneObjectToList(List<Integer> list) {
        list.add(1);
        assert list.size() == 2;
    }


    //add(int index, E obj)
    public static void shouldAddObjectOnSpecificPosition(List<Integer> list) {
        list.add(1);
        list.add(1);
        list.add(1, 2);
        assert list.get(1) == 2;
    }

    //addAll(Collection<? extends E> c)
    public static void addArrayListToExistingCollection(List<Integer> list) {
        //given
        List<Integer> secondList = new ArrayList<>();
        list.add(0);
        list.add(1);
        secondList.add(2);
        secondList.add(3);
        //when
        list.addAll(secondList);
        //then
        assert list.get(2) == 2;
    }


    // boolean addAll(int index, Collection<? extends E> c);
    public static void addCollectionAtSpecificIndex(List<Integer> list) {
        //given
        list.add(0);
        list.add(1);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(2);
        secondList.add(3);

        //when
        list.addAll(1, secondList);

        //then
        assert list.get(1) == 2;
    }
//
//    //clear();
//    public static void afterClearingCollectionIsEmpty(List<Integer> list) {
//        list.add(1);
//        list.clear();
//        assert list.size() == 0;
//    }
//
//    //boolean contains(Object o);
//    public static void checkWhetherListContainsSpecificObject(List<Integer> list) {
//        //given
//        list.add(5);
//        boolean contains;
//        //when
//        contains = list.contains(5);
//        //then
//        assert contains;
//    }
//
//    //boolean containsAll(Collection<?> c);
//    public static void containsAllElementsOfPassedCollection(List<Integer> list) {
//        //given
//        List<Integer> newList = simpleArrayListWithBasicValues();
//        list.addAll(newList);
//        boolean containsAll;
//        //when
//        containsAll = list.containsAll(newList);
//        //then
//        assert containsAll;
//    }

//    //boolean equals(Object o);
//    public static void listIsEqualWithAnotherIfTheyHaveSameObjectsInside(List<Integer> list) {
//        //given
//        List<Integer> arrayList = simpleArrayListWithBasicValues();
//        List<Integer> arrayList2 = simpleArrayListWithBasicValues();
//        Boolean equals;
//        //when
//        equals = arrayList.equals(arrayList2);
//        //then
//        assert equals : "Test not passed in arraylist (equals)";
//    }
//
//    //E get(int index);
//    public static void givesElementOfSpecifiedPosition(List<Integer> list) {
//        //given
//        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        Integer value;
//        //when
//        value = arrayList.get(0);
//        //then
//        assert value == 1 : "Test not passed in arraylist";
//    }
//
//    //int hashCode();
//
//    //int indexOf(Object o);
//    public static void returnIndexOfFirstOccurrenceOfElement(List<Integer> list) {
//        //given
//        List<Integer> arrayList = simpleArrayListWithBasicValues();
//        Integer value;
//        //when
//        value = arrayList.indexOf(3);
//        //then
//        assert value == 2 : "Test not passed in arraylist";
//    }
//
//    //boolean isEmpty();
//    public static void returnsTrueIfListIsEmpty(List<Integer> list) {
//        //given
//        List<Integer> arrayList = new ArrayList<>();
//        Boolean empty;
//        //when
//        empty = arrayList.isEmpty();
//        //then
//        assert empty;
//    }
//
//    //boolean isEmpty();
//    public static void returnsFalseIfListIsNotEmpty(List<Integer> list) {
//        //given
//        List<Integer> arrayList = simpleArrayListWithBasicValues();
//        Boolean empty;
//        //when
//        empty = arrayList.isEmpty();
//        //then
//        assert !empty;
//    }





//    private static ArrayList<Integer> simpleArrayListWithBasicValues() {
//        return new ArrayList<>(Arrays.asList(1,2,3));
//    }
}

