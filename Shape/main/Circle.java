public class Circle extends Shape{
    private final double radius;
    public Circle(){
        radius = 1;
    }
    public Circle(double _radius){
        radius = _radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
