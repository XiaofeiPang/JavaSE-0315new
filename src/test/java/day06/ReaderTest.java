package day06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) {
        try ( Reader reader =new FileReader("0319.md")){
            int i=  reader.read();
            while(i!=-1){
                System.out.print((char)i);
                i=  reader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
