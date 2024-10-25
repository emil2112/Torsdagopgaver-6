public class Square implements Shape {
    double length;

    public Square (double number){
        this.length = number;
    }

    @Override
    public double getArea() {
        return this.length*this.length;
    }
}
