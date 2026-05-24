package CollectionFrameWorkChapter.Collcetion1Part;

import java.util.*;

public class ArrayListBasic {
    static <object> void main() {

        //list orr Collection ->interface


        //Array list -> concrete class
        /* 1 way to create  */
        ArrayList<Integer> list = new ArrayList();
        /* *//* 2 way to create  *//* List<Integer> list = new ArrayList<>();
         *//* 3 way to create  *//* Collection<Integer> collection = new ArrayList<>();*/

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);


        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(" Printing List 2 " + list2);
        list2.clear();
        System.out.println(list2.size());


        // I want to traverse in list using iterator

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));
        System.out.println("Before set List 3 is that " + list3);
        list3.set(0, 110);
        System.out.println("After set List 3 is that " + list3);

// To array convert all list into array
        Object[] arr = list3.toArray();
        for (Object a : arr) {
            System.out.println("Element " + a);

        }


        //Contains
        System.out.println(list3.contains(100));
        System.out.println(list3.contains(110));


        //      ArrayList<Integer> list4 = new ArrayList<>();

//Sort in increase and Decrease
        list.add(12);
        list.add(6);
        list.addLast(12);
        System.out.println("all Element " + list);
        Collections.sort(list);
        System.out.println("all Element " + list);
        Collections.sort(list, Collections.reverseOrder());


//Colne
        ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
        System.out.println(newlist);

        //Ensure Capacity of list
        ArrayList<Integer> Marks= new ArrayList<>();
        Marks.ensureCapacity(100);

/*Collection <Integer> OLd= new ArrayList<>();
       OLd.ensureCapacity(100);*/

      /*   this ensure is work when we use Arraylist
        List<Integer>oldlist= new ArrayList<>();
        oldlist.ensureCapacity(100);
*/



        //Empty

        System.out.println(newlist.isEmpty());
        System.out.println(Marks.isEmpty());

        //IndexOf
        System.out.println(newlist.indexOf(30));

    }
}
