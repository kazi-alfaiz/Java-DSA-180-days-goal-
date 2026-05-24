package CollectionFrameWorkChapter.Collcetion1Part;

import java.util.*;

public class VectorBasic {  static void main() {
    Vector<Integer> list = new Vector<>();
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println(list);
    list.add(40);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);


    //addAll
    List<Integer> list2 = new Vector<>();
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


    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.println("Element " + iterator.next());
    }

    List<Integer> list3 = new Vector<>();
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
    System.out.println("all Element " + list);
    Collections.sort(list);
    System.out.println("all Element " + list);
    Collections.sort(list, Collections.reverseOrder());


//Colne
/*
        LinkedList<Integer> newlist = (LinkedList<Integer>) list.clone();
*/
//        System.out.println(newlist);

    //Ensure Capacity of list
    LinkedList<Integer> Marks= new LinkedList<>();
    //Marks.ensureCapacity(100);

/*Collection <Integer> OLd= new ArrayList<>();
       OLd.ensureCapacity(100);*/

      /*   this ensure is work when we use Arraylist
        List<Integer>oldlist= new ArrayList<>();
        oldlist.ensureCapacity(100);
*/



    //Empty

    //  System.out.println(newlist.isEmpty());
    System.out.println(Marks.isEmpty());

    //IndexOf
    list.add(30);
    list.add(800);
    list.add(30);

    System.out.println("Printing original List " + list);
//System.out.println(list.indexOf(30));


    System.out.println(list.lastIndexOf(30));


    //add fisrt & add last


    System.out.println("Printing original List " + list);
    list.remove(3);
    list.remove(3);
    list.remove(3);
    list.remove(3);
    //list.remove(3);
    System.out.println("Printing original List " + list);

    list.addFirst(12);
    list.addLast(32);
    System.out.println("Printing after add first and last " + list);
        /*list.removeFirst();
        list.removeLast();*/


    System.out.println( list.getFirst());
    System.out.println(        list.getLast());
   /* System.out.println( list.peek());
    System.out.println( list.poll());
    System.out.println(list);
    list.offer(99);*/
    System.out.println("Printing original List after offer " + list);
}
}

