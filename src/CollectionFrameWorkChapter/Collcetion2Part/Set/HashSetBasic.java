package CollectionFrameWorkChapter.Collcetion2Part.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasic {


    static void main() {




        HashSet<Student>set=new HashSet<>();


        Student S1 = new Student(01,"Alfaiz");
        Student S2 = new Student(01,"Alfaiz");
        Student S3 = new Student(01,"Alfaiz");
        set.add(S1);
        set.add(S2);
        set.add(S3);

        System.out.println( set);














        Set<Integer>st= new HashSet<Integer>();
        st.add(1);
        st.add(1);
        st.add(2);
        /*System.out.println(st);*/

Set<Integer> st1= new HashSet<>();
st1.add(1);
st1.add(2);
st1.add(3);
st1.add(4);

Set<Integer> st2= new HashSet<>();
st2.add(3);
st2.add(4);
st2.add(5);
st2.add(6);



       /* System.out.println(st1);

         st1.retainAll(st2);
        System.out.println(st1);


        System.out.println(st2.containsAll(st1));*/






    }
}
