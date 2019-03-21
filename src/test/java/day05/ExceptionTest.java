package day05;

public class ExceptionTest {
    public static void main(String[] args) {

        try{
           // System.exit(0);
            //System.out.println(10/0);
            System.out.println("Hi".charAt(2));
            System.out.println("fuel");

        }
        catch (StringIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("AE");
        }finally {
            System.out.println("always......");
        }
        System.out.println("hello");
    }

}
