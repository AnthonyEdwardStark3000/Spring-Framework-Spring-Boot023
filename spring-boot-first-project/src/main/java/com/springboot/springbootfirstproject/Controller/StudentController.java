package com.springboot.springbootfirstproject.Controller;

import com.springboot.springbootfirstproject.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
//    Creating REST API That returns Student Bean
    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(3000,"Suresh", "Babu");
        return student;
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"check","stu"));
        students.add(new Student(2,"meow","chew"));
        students.add(new Student(3,"Rai","chew"));
        return students;
    }
//    Rest API with path variable
    @GetMapping("/student/{id}/{firstName}/{lastName}")
            // {id, firstName, lastName} is the URI Template variable .
    public Student StudentPathVariable(@PathVariable int id,
                                       @PathVariable("firstName") String fName,
                                       @PathVariable("lastName") String lname){
        return new Student(id, fName , lname);
    }
//    Rest API with Requestparam
//    http://localhost:8080/students/query?id=1&firstName=Suresh&lastName=Stark
    @GetMapping("/students/query")
    public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }

//    REST API Post request
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }
}
