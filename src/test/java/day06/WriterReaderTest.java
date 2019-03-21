package day06;

import java.io.*;

public class WriterReaderTest {
    public static void main(String[] args) throws IOException {
        try(Writer writer= new FileWriter("KA.md");
            Reader reader= new FileReader("build.gradle")) {


           int i= reader.read();
            while(i!=-1){
                writer.write(i);
                System.out.print((char)reader.read());
                i= reader.read();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
