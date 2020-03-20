public class Square extends Shape{
    private final double length;
    public Square(){
        length = 1;
    }
    public Square(double _length){
        length = _length;
    }
    @Override
    public double area(){
        return length * length;
    }
}
