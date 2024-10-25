import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<Person>();
        ArrayList<String> basicCourses = new ArrayList<String>();
        ArrayList<String> teacher1Courses = new ArrayList<String>();
        ArrayList<String> teacher2Courses = new ArrayList<String>();

        basicCourses.add("Math level: B");
        basicCourses.add("Danish level: A");
        basicCourses.add("English level: B");

        teacher1Courses.add("Python");
        teacher1Courses.add("JavaScript");
        teacher2Courses.add("Java 1.0");
        teacher2Courses.add("UML");

        Teacher teacher1 = new Teacher(teacher1Courses, "Lotte");
        Teacher teacher2 = new Teacher(teacher2Courses, "Lars");

        Student student1 = new Student(basicCourses, "Jens");
        Student student2 = new Student(basicCourses, "Bo");
        Student student3 = new Student(basicCourses, "Ivan");

        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);

        for(Person s: persons){
            if(s instanceof Student){
                if(s.addCourse("Java 1.0")){
                    System.out.println(s.getName());
                    System.out.println(" har allerede bestået dette kursus");
                }else{
                    System.out.println("Kursus tilføjet");
                }
            }
            if(s instanceof Teacher){
                if(s.addCourse("Java 1.0")){
                    System.out.println("Er kvalificeret til at undervise i dette fag.");
                }else{
                    System.out.println(s.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}
