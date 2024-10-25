import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea(ArrayList<Shape> shapes){
        double totalArea = 0;
        for(Shape s : shapes){
            double totalArea = totalArea+s.getArea();
        }
    }
}
