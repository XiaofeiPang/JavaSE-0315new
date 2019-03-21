package day03;



public class Area {
    double length;
    double wide;
    double height;
    public Area(double length, double wide, double height) {
        this.length = length;
        this.wide = wide;
        this.height = height;

    }
    public double mn() {
       double area = length * wide * height;
       return area;
    }

}
