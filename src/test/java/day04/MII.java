package day04;


import java.util.Hashtable;

public class MII {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"Hi");
        hashtable.put(2,"hello");
        System.out.println(hashtable.size());
        for (Integer integer:hashtable.keySet()) {
            System.out.println(integer+"->"+hashtable.get(integer));

        }

    }



}
