package ma.emsi.students.services;

import ma.emsi.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {
    List<Student> getStudents();
    Student getStudent(Long id);
    String addStudent(Student s);


}
