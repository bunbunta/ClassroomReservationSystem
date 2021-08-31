package com.teamte4a.classroomreservationsystem;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class StudentForm {
    private Integer id ;
    @NotNull
    @Size(min = 3)
    private String name;
    @Size(max = 20)
    private int grade;
    private String tell;
    private String address;
}