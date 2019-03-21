package Lin;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Demo {
    public static void main(String[] args) {
        long sum=0L;
        char m='\345';
        float b=3.56f;
        String w1="China"+"is"+"ambitious";
        String w2 ="long";
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println( (int) m);
        System.out.printf("%f\n",b);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1.equals(w2));
        int[]arr={1,2,3,4};
        for(int j=0;j<=3;j++){
            System.out.println(arr[j]);
        }
    }
}

