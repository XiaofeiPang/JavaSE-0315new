package day04;


import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class ArrayListTest {
    private static void test(){
        ArrayList<String> strings=new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }


        Vector<Integer> integers =new Vector<>();
        System.out.println(integers.capacity());
    }


    public static void main(String[] args) {
      long start= System.nanoTime();
        Random random= new Random();
        int h=random.nextInt(20)+1;
        int j=(int)(Math.random()*20)+1;
        test();
        System.out.println(h);
        System.out.println(j);
        System.out.println(System.nanoTime()-start);

    }
}
