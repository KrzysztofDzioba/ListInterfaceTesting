import java.util.ArrayList;
import java.util.List;

public class ArrayListTests {

    //add(E obj)
    public static void testAddObject() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        //when
        arrayList.add(1);
        //then
        assert arrayList.size() == 1 : "Adding objects doesnt work properly";
    }

    //add(int index, E obj)
    public static void testAddObjectOnSpecificPosition() {
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
    public static void addAllCollection() {

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
    public static void testClear() {
        //given
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        //when
        arrayList.clear();
        //then
        assert arrayList.size() == 0 : "Error";
    }
}

