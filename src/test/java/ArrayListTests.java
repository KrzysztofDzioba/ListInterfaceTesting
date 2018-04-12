import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTests {

    //add(E obj)
    public static void shouldAddOneObjectToList() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        //when
        arrayList.add(1);
        //then
        assert arrayList.size() == 1 : "Adding objects doesnt work properly";
    }

    //add(int index, E obj)
    public static void shouldAddObjectOnSpecificPosition() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        //when
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1, 2);

        //then
        assert arrayList.get(1) == 2 : "Error";
    }

    //addAll(Collection<? extends E> c)
    public static void addOtherCollectionToExistingCollection() {

        //given
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(2);
        secondList.add(3);

        //when
        arrayList.addAll(secondList);

        //then
        assert arrayList.get(2) == 2 : "Error";
        assert arrayList.get(3) == 3 : "Error";
    }

    // boolean addAll(int index, Collection<? extends E> c);
    public static void addCollectionAtSpecificIndex() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(2);
        secondList.add(3);

        //when
        arrayList.addAll(1, secondList);

        //then
        assert arrayList.get(1) == 2 : "Error";
        assert arrayList.get(0) == 0 : "Error";
    }

    //clear();
    public static void afterClearingCollectionIsEmpty() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        //when
        arrayList.clear();
        //then
        assert arrayList.size() == 0 : "Error";
    }

    //boolean contains(Object o);
    public static void checkWhetherListContainsSpecificObject() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        Boolean contains;
        //when
        contains = arrayList.contains(5);

        //then
        assert contains : "Error";
    }

    //boolean containsAll(Collection<?> c);
    public static void containsAllElementsOfPassedCollection() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> newList = Arrays.asList(1, 2, 3);
        arrayList.addAll(newList);
        Boolean containsAll;
        //when
        containsAll = arrayList.containsAll(newList);
        //then
        assert containsAll : "containsAll() failed";
    }

    //boolean equals(Object o);
}

