package Services.ServiceImplementation;

import Services.TeacherTasks;
import model.Person;

public class TeacherTasksImplementation  implements TeacherTasks {
    private Person teacher = new Person();
    public void teach(Person teacher) {
        if (teacher.getLevel()!=null&&teacher.getLevel().equals("Academic staff")){
            System.out.println("teach students!!");
        }
        else if(teacher.getLevel()==null||!teacher.getLevel().equals("Academic staff")){
            System.out.println("get your sorry asses to the staff room");
        }

    }
}
