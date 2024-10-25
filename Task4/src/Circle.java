public class Circle implements Shape {
    double radius;

    public Circle(double number){
        this.radius = number;
    }

    public double getArea(){
        return 3.14*(this.radius*this.radius);
    }
}
