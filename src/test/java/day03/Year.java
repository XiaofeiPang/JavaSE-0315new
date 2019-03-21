package day03;
public class Year {

    void mom(int year){
       if((year%400==0)||(year/100==0)){
           System.out.println("今年是闰年");
       }
       else{
           System.out.println("今年不是闰年");
       }
    }

}
