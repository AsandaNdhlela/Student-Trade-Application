package za.ac.student_trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.student_trade.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {

    List<Student> findByFirstNameAndLastName(String firstName, String lastName);
    List<Student> findByEmail(String email);

//    List<Student> findByRoomNumber(String roomNumber);
}
