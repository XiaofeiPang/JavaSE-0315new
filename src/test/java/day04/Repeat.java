package day04;

import java.util.Random;

public class Repeat {
    public static void main(String[] args) {
        int [] a= new int  [20];
        Random random= new Random();
        int s=0;
        for (int i = 0; i <20; i++) {
            a[s]=i;
            s++;
            System.out.println(a[s]);
        }
       /* for (int i=1; i <10000; i++) {

            a[s] =random.nextInt();

        }*/

    }
}
