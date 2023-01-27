package ma.emsi.students;

import ma.emsi.students.entities.Student;
import ma.emsi.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository  studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student(null,"zakaria","zk1234","12/06/2000"));
        studentRepository.save(new Student(null,"mouhcine","mh4456","2/03/200"));
        studentRepository.save(new Student(null,"charaf","ch46","4/13/2004"));

    }
}
