package az.student.springstudents.model;

import lombok.*;

import java.time.LocalDate;

@Builder
@Data
public class Student {
    private String Name;
    private String Surname;
    private int Age;
    @NonNull
    private String Email;
    private LocalDate BirthDate;
}
