package day03;

public class DELL {
    public static void main(String[] args) {
        for(int i=101;i<200;i+=2){
           boolean m=false;
            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    m=false;
                    break;
                }
                else{
                    m=true;
                }

            }
            if(m==true){
                System.out.println(i);
            }

        }

    }
}
