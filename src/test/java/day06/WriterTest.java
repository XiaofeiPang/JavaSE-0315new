package day06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.WrongMethodTypeException;

public class WriterTest {
    public static void main(String[] args) {
        try (Writer writer =new  FileWriter("new.md")){

            writer.write("03中国");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
