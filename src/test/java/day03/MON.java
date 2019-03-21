package day03;
class World{
  public static  void bare(MON mon){
        System.out.println(mon.style);
        mon.style++;
        System.out.println(mon.style);
    }
    public static void main(String[] args) {

        MON mon =new MON ();
        System.out.println(mon.style);
        bare(mon);
        System.out.println(mon.style);
    }

}
 class MON {
   int style;
}