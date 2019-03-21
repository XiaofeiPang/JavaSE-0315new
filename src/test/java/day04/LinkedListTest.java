package day04;

import java.util.*;


public class LinkedListTest {
    public static void main(String[] args) {
        Map<Integer,String> strings=new LinkedHashMap<>();
        strings.put(1,"Chain");
        strings.put(3,"grant");
        strings.put(2,"is");
        /*for (String string : strings) {
            System.out.println(string);
        }*/
        for (Integer integer : strings.keySet()) {
            System.out.println(integer+"->"+strings.get(integer));
        }

    }
}
