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



    private static Student studentThree = StudentFactory.createStudent("Brian", "O'Connor","brianoconnor@gmail.com", "2fast2farious", null);

    @Test
    public void a_createStudent() {
        assertNotNull(studentThree);
        System.out.println(studentThree.toString());
    }
}