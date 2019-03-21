package day05;

public class PECS<N extends  Number> {
    private  void print(N t1,N t2){
        System.out.println(t1);
        System.out.println(t2);
    }


    public static void main(String[] args) {
        int i=2;
        int j=3;
        PECS <Integer> integerPECS=new PECS<>();
        integerPECS.print(i,j);
    }

}
