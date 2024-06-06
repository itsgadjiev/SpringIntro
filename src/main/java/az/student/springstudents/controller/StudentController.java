package az.student.springstudents.controller;

import az.student.springstudents.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(
                Student.builder().Name("Jack").Surname("Doe").Email("jack@mail.com").Age(21).build(),
                Student.builder().Name("Jack2").Surname("Doe2").Email("jack@mail.com").Age(211).build(),
                Student.builder().Name("Jack3").Surname("Doe3").Email("jack@mail.com").Age(212).build()
        );
    }
}

