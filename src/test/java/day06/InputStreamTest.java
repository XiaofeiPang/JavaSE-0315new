package day06;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    private  static final  String NAME="src/test/java/day06/InputStreamTest.java";
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream(NAME)){

            int i=inputStream.read();
            while (i!=-1){
                System.out.print((char)i);

                i=inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
