package Services.ServiceImplementation;

import Services.TeacherTasks;
import model.Person;

import java.io.FileReader;
import java.io.IOException;

public class TeacherTasksImplementation  implements TeacherTasks {
    private Person teacher = new Person();
    public String teach(Person teacher) throws RuntimeException{
        if (teacher.getLevel()!=null&&teacher.getLevel().equals("Academic staff")){
            return "teach students!!";
        }
        else if(teacher.getLevel()==null){
            throw new NullPointerException("There is no level set for student");
        }
        return "You can't teach this class!!";
    }
}
