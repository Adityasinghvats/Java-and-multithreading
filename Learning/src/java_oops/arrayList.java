package java_oops;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
//        add elements
        list.add(0);
        list.add(1);
        list.addFirst(9);
        System.out.println(list);
//        getting
//        list.get(index)
        int element = list.get(2);
        System.out.println("The element is "+ element);

//        add element in between
        list.add(1,12);
        System.out.println(list);


//        set element
        list.set(2,5);
        System.out.println(list);

//        delete element
        list.remove(3);
        System.out.println(list);

//        count no.
        int size = list.size();
        System.out.println("Size of arraylist is "+size);

//        transversal
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();

//        sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
