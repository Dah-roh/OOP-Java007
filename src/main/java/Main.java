public class Main extends Person{

    public static void main(String[] args) {
        Person teacher = new Person("Helen", 28, "Academic staff", "single", 50000);
        Person student = new Person("Mamuzo", 18, "single");
        TeacherTasksImplementation teacherTasksImplementation = new TeacherTasksImplementation();
        teacherTasksImplementation.teach(student);
    }
    Person staff = new Person("Helen", 28, "Academic staff", "single", 50000);
    Person student = new Person("Mamuzo", 18, "single");

    public Main(String name, int age, String level, String maritalStatus, double salary) {
        super(name, age, level, maritalStatus, salary);
    }
}
