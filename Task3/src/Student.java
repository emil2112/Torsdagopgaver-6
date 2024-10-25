import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> passedCourses = new ArrayList<>();

    public Student(ArrayList passedCourses, String name){
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course){
        for(String s : passedCourses){
            if(s.equals(course)){
                return true;
            }
        }
        currentCourses.add(course);
        return false;
    }

}
