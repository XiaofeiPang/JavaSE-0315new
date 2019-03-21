package day04;

public class Array {
    public static void main(String[] args) {
        String [][] a={{"china","is","ambiguous"},{"ties","fertile","waters"}};
        for (int i = 0; i <a.length ; i++) {
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
          //  System.out.println();
        }
    }


}
