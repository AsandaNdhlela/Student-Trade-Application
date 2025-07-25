package za.ac.student_trade.factory;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.student_trade.domain.Student;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentFactoryTest {

//    private static Student student = StudentFactory.createStudent("Thando", "Nyathi", "manyathit@gmail.com",
//            "thandoManyathi","22","Brackeer", "Phola Park", "Piet Retief", "Mpumalanga",
//            2380, "President Houe", "222", 2,"South Point");

//    private static Student studentTwo = StudentFactory.createStudent("Kyle", "Ntanjana", "kylntnjana@gmail.com",
//            "kylNtanjana","102", "Peter", "Petter Parker", "London","Western Cape",8000,
//            null);

    private static Student studentThree = StudentFactory.createStudent("Brian", "O'Connor","brianoconnor@gmail.com", "2fast2farious", null);

//    @Test
//    public void c_createStudentWithAddressAndResidence() {
//        assertNotNull(student);
//        System.out.println(student.toString());
//    }
//
//    @Test
//    public void b_createStudentWithAddress() {
//        assertNotNull(studentTwo);
//        System.out.println(studentTwo.toString());
//    }

    @Test
    public void a_createStudent() {
        assertNotNull(studentThree);
        System.out.println(studentThree.toString());
    }
}