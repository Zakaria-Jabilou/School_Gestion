package ma.emsi.students.web;


import ma.emsi.students.entities.Student;
import ma.emsi.students.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    private IStudentService istudentservice;

    public StudentController(IStudentService iStudentService){
        this.istudentservice=iStudentService;

    }


    @GetMapping("/students")
    public List<Student> params(){

        return istudentservice.getStudents() ;
    }

    @GetMapping("/students/{id}")
    public Student params(@PathVariable Long id){

        return istudentservice.getStudent(id) ;
    }


}
