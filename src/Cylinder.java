public class Cylinder extends Circle {
    public Cylinder(){
    }
    double height;
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return  height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return height*getArea();
    }
    @Override
    public String toString(){
        return "A Cylinder with height: "+getHeight()+" and buttom "+super.toString();
    }
}
