import java.util.*;

public class ListTests {

    //add(E obj)
    public static void shouldAddOneObjectToList(List<Integer> list) {
        list.add(1);
        assert list.size() == 1;
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
        List<Integer> secondList = emptyList(list);
        secondList.add(2);
        secondList.add(3);

        //when
        list.addAll(1, secondList);

        //then
        assert list.get(1) == 2;
    }

    //clear();
    public static void afterClearingCollectionIsEmpty(List<Integer> list) {
        list.add(1);
        list.clear();
        assert list.size() == 0;
    }

    //boolean contains(Object o);
    public static void checkWhetherListContainsSpecificObject(List<Integer> list) {
        //given
        list.add(5);
        boolean contains;
        //when
        contains = list.contains(5);
        //then
        assert contains;
    }

    //boolean containsAll(Collection<?> c);
    public static void containsAllElementsOfPassedCollection(List<Integer> list) {
        //given
        List<Integer> newList = simpleListWithBasicValues(list);
        list.addAll(newList);
        boolean containsAll;
        //when
        containsAll = list.containsAll(newList);
        //then
        assert containsAll;
    }

    //boolean equals(Object o);
    public static void listIsEqualWithAnotherIfTheyHaveSameObjectsInside(List<Integer> list) {
        //given
        List<Integer> list1 = simpleListWithBasicValues(list);
        List<Integer> list2 = simpleListWithBasicValues(list);
        boolean listsAreEqual = false;
        //when
        if(list1.size() == list2.size() && list1.get(0).equals(list2.get(0)) && list1.get(1).equals(list2.get(1)) &&
                                                                                list1.get(2).equals(list2.get(2)))
            listsAreEqual = true;
        //then
        assert listsAreEqual;
    }

    //E get(int index);
    public static void givesElementOfSpecifiedPosition(List<Integer> list) {
        //given
        List<Integer> arrayList = emptyList(list);
        arrayList.add(1);
        Integer value;
        //when
        value = arrayList.get(0);
        //then
        assert value == 1;
    }

    //int hashCode();

    //int indexOf(Object o);
    public static void returnIndexOfFirstOccurrenceOfElement(List<Integer> list) {
        //given
        list = simpleListWithBasicValues(list);
        Integer value;
        //when
        value = list.indexOf(3);
        //then
        assert value == 2;
    }

    //boolean isEmpty();
    public static void returnsTrueIfListIsEmpty(List<Integer> list) {
        boolean empty = false;
        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            empty = true;
        }

        assert empty;
    }

    //boolean isEmpty();
    public static void returnsFalseIfListIsNotEmpty(List<Integer> list) {
        list = simpleListWithBasicValues(list);
        boolean empty = false;
        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            empty = true;
        }

        assert !empty;
    }

    //Iterator<E> iterator();
    public static void methodReturnsIteratorObject(List<Integer> list) {
        assert list.iterator() != null;
    }

    //int lastIndexOf(Object o);
    public static void givenElementReturnsLastItsOccurenceInList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        myList.addAll(Arrays.asList(3, 3));
        //when
        Integer value = myList.lastIndexOf(3);
        //then
        assert value == 4;
    }

    //ListIterator<E> listIterator();
    public static void shouldReturnlistIteratorObject(List<Integer> list) {
        //given
        List<Integer> myList = emptyList(list);
        //when
        ListIterator<Integer> iterator = myList.listIterator();
        //then
        assert iterator != null;
    }

    //ListIterator<E> listIterator(int index);
    public static void shouldReturnIteratorOnSpecifiedPosition(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        ListIterator<Integer> iterator = myList.listIterator(1);
        //then
        assert iterator.next() == 2;
    }

    //E remove(int index);
    public static void shouldRemoveObjectAtSpecifiedIndexFromList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        myList.remove(2);
        //then
        assert myList.size() == 2;
    }

    //E remove(int index);
    public static void whenRemovingFromListRemovingObjectIsReturned(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        Integer value = myList.remove(0);
        //then
        assert value == 1;
    }

    //boolean remove(Object o);
    public static void removeSpecifiedObjectInList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        myList.remove((Object) 1);
        //then
        assert !myList.contains(1);
    }

    //boolean remove(Object o);
    public static void returnsTrueIfRemovingObjectWasInList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        //when
        boolean objectWasInList = myList.remove((Object) 1);
        //then
        assert objectWasInList;
    }

    //boolean remove(Object o);
    public static void returnsFalseIfRemovingObjectWasNotInList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        boolean objectWasInList = myList.remove(strangeObject());
        //then
        assert !objectWasInList;
    }

    //boolean removeAll(Collection<?> c);
    public static void removesAllObjectsOfGivenCollection(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        myList.removeAll(Arrays.asList(1, 2));
        //then
        assert !myList.contains(1) && !myList.contains(2);
    }

    //boolean removeAll(Collection<?> c);
    public static void returnsTrueIfAllObjectsFromGivenCollectionWereRemoved(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        boolean allRemoved = myList.removeAll(Arrays.asList(1, 2));
        //then
        assert allRemoved;
    }

    //boolean removeAll(Collection<?> c);
    public static void returnsFalseIfNotAllObjectsFromGivenCollectionWereRemoved(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        boolean allRemoved = myList.removeAll(Arrays.asList(strangeObject()));
        //then
        assert !allRemoved;
    }

    // void replaceAll(UnaryOperator<E> operator)
    public static void givenUnaryOperatorTestIfMethodModifyObjectsInsideList(List<Integer> list) {
        //given
        list.add(1);
        //when
        list.replaceAll(t -> t+1);
        //then
        assert list.contains(2);
    }

    //boolean retainAll(Collection<?> c);
    public static void retainInListOnlyGivenElementsInCollection(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        list.add(1);
        //when
        myList.retainAll(list);
        //then
        assert myList.size() == 1 && myList.get(0) == 1;
    }

    //E set(int index, E element);
    public static void elementOnSpecifiedIndexIsReplacedByGivenElement(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        Integer simpleValue = 10;
        //when
        myList.set(0, simpleValue);
        //then
        assert myList.get(0).equals(simpleValue);
    }
    //E set(int index, E element);
    public static void returnsPreviousElementOnGivenPositionWhenNewIsSetOnIt(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        Integer simpleValue = 10;
        //when
        Integer oldElement = myList.set(0, simpleValue);
        //then
        assert oldElement.equals(1);
    }

    //int size();
    public static void returnsAppropiateSizeOfTheList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        int size = myList.size();
        //then
        assert size == 3;
    }

    //void sort(Comparator<? super E> c)
    public static void whenGivenComparatorListIsSortedCorrectly(List<Integer> list) {
        //given
        List<Integer> myList = emptyList(list);
        myList.addAll(Arrays.asList(3,2,1));
        //when
        myList.sort((number, anotherNumber)-> number - anotherNumber);
        //then
        assert myList.get(0) == 1;
    }

    //Spliterator<E> spliterator()
    public static void methodReturnsSpliteratorObject(List<Integer> list) {
        //given
        List<Integer> myList = emptyList(list);
        //when
        Spliterator<Integer> spliterator = myList.spliterator();
        //then
        assert spliterator != null;
    }

    //List<E> subList(int fromIndex, int toIndex);
    public static void givenFromAndToIndexesCreateSublistWithProperElementsCount(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        List<Integer> mySublist = myList.subList(0, 2);
        //then
        assert mySublist.size() == 2;
    }

    //Object[] toArray();
    public static void givenListCreateObjectArrayOfIt(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        //when
        Object[] el = myList.toArray();
        //then
        assert el[0].equals(1) && el[1].equals(2) && el[2].equals(3);
    }

    //<T> T[] toArray(T[] a);
    public static void givenEmptyArrayTestIfThisArrayIsEqualsToReturnedArrayOfToArrayMethod(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        Integer[] firstArray = new Integer[myList.size()];
        //when
        Integer[] secondArray = myList.toArray(firstArray);
        //then
        assert firstArray == secondArray;
    }

    //<T> T[] toArray(T[] a);
    public static void givenEmptyArrayTestIfInThisArrayAreElementsFromList(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        Integer[] array = new Integer[myList.size()];
        //when
        myList.toArray(array);
        //then
        assert array[0].equals(myList.get(0)) && array[1].equals(myList.get(1)) && array[2].equals(myList.get(2));
    }

    //<T> T[] toArray(T[] a);
    public static void testToArrayMethodGivenEmptyArrayWithSmallSizeTestIfNewArrayIsReturnedinToArrayMethod(List<Integer> list) {
        //given
        List<Integer> myList = simpleListWithBasicValues(list);
        Integer[] array = new Integer[0];
        //when
        Integer[] array2 = myList.toArray(array);
        //then
        assert array != array2;
    }














    private static List<Integer> simpleListWithBasicValues(List<Integer> list) {
        if(list instanceof ArrayList) {
            return new ArrayList<>(Arrays.asList(1, 2, 3));
        }
        return new LinkedList<>(Arrays.asList(1, 2, 3));
    }

    private static List<Integer> emptyList(List<Integer> list) {
        if(list instanceof ArrayList)
            return new ArrayList<>();
        return new LinkedList<>();
    }

    private static Object strangeObject() {
        Object strangeObject = 666;
        return strangeObject;
    }
}

