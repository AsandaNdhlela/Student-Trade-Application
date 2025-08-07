package za.ac.student_trade.service.Impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import za.ac.student_trade.domain.Address;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.factory.AddressFactory;
import za.ac.student_trade.factory.ResidenceFactory;
import za.ac.student_trade.factory.StudentFactory;
import za.ac.student_trade.repository.AddressRepository;
import za.ac.student_trade.repository.ResidenceRepository;
import za.ac.student_trade.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {

    @Autowired
    private StudentServiceImpl studentServiceImpl;
    @Autowired
    private AddressServiceImpl addressServiceImpl;
    @Autowired
    private ResidenceServiceImpl residenceServiceImpl;

    private Residence residence;
    private Address address;
    private Student student;

    @BeforeEach
    void setUp() {
        address = AddressFactory.createAddress("22","Brackeer", "Phola Park", "Piet Retief", "Mpumalanga",2380);

    }
    @Test
    void create() {
        //saving address
        Address address1 = addressServiceImpl.create(address);
        assertNotNull(address1);

        //saving residence
        residence = ResidenceFactory.createResidence("President House", "222", 2,"South Point", address1);


        Residence residence1 = residenceServiceImpl.create(residence);
        assertNotNull(residence1);
        System.out.println(residence1.toString());

        //saving student
        student = StudentFactory.createStudent("Nkululeko", "Ndlovu", "asandat@gmail.com","asanda123", residence1);

        Student created = studentServiceImpl.create(student);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    @Disabled
    void read() {
    }

    @Test
    @Disabled
    void update() {
    }
}