package day03;




public  class Finally {
    public static void main(String[] args) {
        Loo yao =new Loo(23,40);
        Loo.setName("tom");
        Loo.earth("jerry");

        System.out.println("\n年龄" +yao.getAge()+"\n姓名"+Loo.getName()+"\n成绩"+yao.getGrade());
    }
}
class Loo{
    private static String name;
    private  int age;
    private  int grade;

    public Loo(int age, int grade) {
        this.age = age;
        this.grade = grade;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Loo.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public  static  void earth(String name){
        Loo.name=name;
        System.out.println("地球是大家的");
    }


}