package day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutInputTest {
    public static void main(String[] args) {
        try {
            OutputStream outputStream =new FileOutputStream("LS.md") ;
            outputStream.write((char)45);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
