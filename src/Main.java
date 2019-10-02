public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle();
        Circle circle = new Circle(6.5,"Red");
        System.out.println(circle);
        double areaCircle = circle.getArea();
        System.out.println("Area Circle is: "+areaCircle);
        Cylinder cylinder = new Cylinder(7.5,8.0,"Mau xxx");
        System.out.println(cylinder);
        double volumeCylinder = cylinder.getVolume();
        System.out.println("volume Cylinder is: "+volumeCylinder);
    }
}
