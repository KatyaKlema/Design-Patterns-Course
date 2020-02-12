public class Rectangle extends Shape{
    private final double length;
    private final double width;

    public Rectangle(){
        length = 1;
        width = 1;
    }
    public Rectangle(double _length, double _width){
        length = _length;
        width = _width;
    }
    @Override
    public double area(){
        return length * width;
    }
}
