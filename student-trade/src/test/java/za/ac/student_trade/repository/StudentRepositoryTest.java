package za.ac.student_trade.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.student_trade.domain.Address;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.factory.AddressFactory;
import za.ac.student_trade.factory.ResidenceFactory;
import za.ac.student_trade.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ResidenceRepository residenceRepository;

    private static Residence residence;
    private static Address address;
    private static Student student;

    @BeforeEach
    void setUp() {
       address = AddressFactory.createAddress("22","Brackeer", "Phola Park", "Piet Retief", "Mpumalanga",2380);

       residence = ResidenceFactory.createResidence("President House", "222", 2,"South Point", address);

       student = StudentFactory.createStudent("Asanda", "Ndhlela", "asandat@gmail.com","asanda123", residence);

    }
//    private static Residence residence = ResidenceFactory.createResidence("President House", "222", 2,"South Point");

    @Test
    void create() {
        //saving address
        Address address1 = addressRepository.save(address);
        assertNotNull(address1);

        //saving residence

        Residence residence1 = residenceRepository.save(residence);
        assertNotNull(residence1);
        System.out.println(residence1.toString());

        //saving student
        Student created = studentRepository.save(student);
        assertNotNull(created);
        System.out.println(created.toString());
    }
}