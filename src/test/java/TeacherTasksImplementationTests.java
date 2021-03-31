import Services.ServiceImplementation.TeacherTasksImplementation;
import model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTasksImplementationTests {
    private Person teacher;
    private Person cleaner;
    private TeacherTasksImplementation teacherTasksImplementation;

    @BeforeEach
    public void setUp() throws Exception {
        teacher = new Person("Helen", 28, "Academic staff", "single", 50000);
        cleaner = new Person("Helen", 28, "Non-Academic staff", "single", 50000);
        teacherTasksImplementation = new TeacherTasksImplementation();
    }

    @Test
    public void testTeach(){
        assertEquals("You can't teach this class!!", teacherTasksImplementation.teach(cleaner));
        assertTrue( teacherTasksImplementation.teach(teacher).equals("teach students!!"));
        assertNotSame("teach students!", teacherTasksImplementation.teach(teacher));
    }
}
