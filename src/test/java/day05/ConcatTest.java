package day05;

public class ConcatTest<T> {
    private void Concat(T t1, T t2) {
        System.out.println(String.valueOf(t1) + String.valueOf(t2));
    }


    public static void main(String[] args) {
        String c1 = "pang";
        String c2 = "xiao";
        ConcatTest<String> s1 = new ConcatTest<>();

        s1.Concat(c1, c2);


        int m = 1;
        int n = 1;
        ConcatTest<Integer> c3 = new ConcatTest<>();
        c3.Concat(m, n);
        boolean c5 = true;
        boolean c6 = false;
        ConcatTest<Boolean> k = new ConcatTest<>();
        k.Concat(c5, c6);


    }
}
