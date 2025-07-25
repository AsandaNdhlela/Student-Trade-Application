package za.ac.student_trade.factory;

import za.ac.student_trade.domain.Address;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.util.Helper;

import java.util.Random;
import java.util.UUID;

public class StudentFactory {

    public static Student createStudent(String firstName, String lastName, String email, String password, Residence residence) {

        String studentId = Helper.generateId();
        return new Student.Builder()
                .setStudentId(studentId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setResidence(residence)
                .build();
    }
}
