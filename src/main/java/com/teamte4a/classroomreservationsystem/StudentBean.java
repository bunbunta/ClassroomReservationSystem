package com.teamte4a.classroomreservationsystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {
    @Id
    @GeneratedValue
    private Integer id ;
    @Column(nullable = false)
    private String name;
    private int grade;
    private String tell;
    private String address;
}