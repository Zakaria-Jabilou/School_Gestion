package ma.emsi.students.services;

import ma.emsi.students.entities.Student;
import ma.emsi.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getStudents(){

        return studentRepository.findAll();

    }

    public Student getStudent(Long id){

        return studentRepository.findById(id).orElse(null);

    }


    public String addStudent(Student s){
        if (s != null){
            studentRepository.save(s);
        }

        return "saved";

    }
}
