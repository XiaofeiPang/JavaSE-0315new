package day05;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            call();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void call() throws FileNotFoundException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please input...");
        String s= scanner.nextLine();
        RandomAccessFile randomAccessFile= new RandomAccessFile("c:/123.txt","rwd");
    }
}
