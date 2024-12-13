package testCom;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        //Creating a list of names
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Milan");
        list1.add("Tamang");
        list1.add("Aaisha");
        list1.add("Shahi");
        list1.add("Hero Milan");

        //Sorting the list
        Collections.sort(list1);

        //Printing
        for(String print: list1){
            System.out.println(print);
        }

        System.out.println("Sorting the numbers....");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(80);
        list2.add(77);
        list2.add(89);

        //Sorting
        Collections.sort(list2);

        //Printing
        for(Integer a: list2){
            System.out.println(a);
        }
    }
}
