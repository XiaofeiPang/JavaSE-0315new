package day03;



public  class Abstrct {
    public static void main(String[] args) {
        Moke moke =new Moke();
        moke.shape();
    }
}
 abstract class kl{
    public abstract void shape();
}

class Moke extends  kl {
    public void shape() {
        System.out.println("狗在叫");
    }
}