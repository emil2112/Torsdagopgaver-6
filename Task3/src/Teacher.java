import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(ArrayList canTeach, String name){
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course){
        for(String s : canTeach){
            if(s.equals(course)){
                return true;
            }
        }
        return false;
    }
}
