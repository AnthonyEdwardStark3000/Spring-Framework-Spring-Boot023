package com.springboot.springbootfirstproject.Controller;

import com.springboot.springbootfirstproject.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
//    Creating REST API That returns Student Bean
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(3000,"Suresh", "Babu");
//        return new ResponseEntity<>(student, HttpStatus.OK);
          return ResponseEntity.ok()
                  .header("custom-header","Come on dood")
                  .body(student);
    }
//    @GetMapping("/students")
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"check","stu"));
        students.add(new Student(2,"meow","chew"));
        students.add(new Student(3,"Rai","chew"));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
//    Rest API with path variable
//    @GetMapping("/student/{id}/{firstName}/{lastName}")
    @GetMapping("/{id}/{firstName}/{lastName}")
            // {id, firstName, lastName} is the URI Template variable .
    public ResponseEntity<Student> StudentPathVariable(@PathVariable int id,
                                       @PathVariable("firstName") String fName,
                                       @PathVariable("lastName") String lname){
        Student student = new Student(id, fName , lname);
        return ResponseEntity.ok(student);
    }
//    Rest API with Requestparam
//    http://localhost:8080/students/query?id=1&firstName=Suresh&lastName=Stark
//    @GetMapping("/students/query")
    @GetMapping("/query")
    public ResponseEntity<Student> studentRequestVariable(
                            @RequestParam int id,
                            @RequestParam String firstName,
                            @RequestParam String lastName){
         Student student = new Student(id,firstName,lastName);
        return ResponseEntity.ok(student);
    }

//    REST API Post request
//    @PostMapping("students/create")
    @PostMapping("/create")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }
//     REST API controller for Put request
//    @PutMapping("students/{id}/update")
    @PutMapping("/{id}/update")
    public ResponseEntity<Student> updateStudent(
            @PathVariable("id") int studentId,
            @RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }

//    @DeleteMapping("students/{id}/delete")
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        System.out.println("The student data has been deleted for the id : "+id);
        return ResponseEntity.ok("Student data has been deleted !"+id);
    }
}
