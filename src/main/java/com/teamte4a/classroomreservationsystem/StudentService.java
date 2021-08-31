package com.teamte4a.classroomreservationsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public StudentForm create(StudentForm studentForm) {
        StudentBean studentBean = new StudentBean();
        BeanUtils.copyProperties(studentForm, studentBean);
        studentRepository.save(studentBean);
        return studentForm;

    }
    public StudentForm update(StudentForm studentForm) {
        StudentBean studentBean = new StudentBean();
        BeanUtils.copyProperties(studentForm, studentBean);
        studentRepository.save(studentBean);
        return studentForm;
    }


    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }


    public List<StudentForm> findAll() {
        List<StudentBean> beanList = studentRepository.findAll();
        List<StudentForm> formList = new ArrayList<StudentForm>();
        for(StudentBean studentBean: beanList) {
            StudentForm studentForm = new StudentForm();
            BeanUtils.copyProperties(studentBean, studentForm);
            formList.add(studentForm);
        }
        return formList;
    }

    public StudentForm findOne(Integer id) {
        Optional<StudentBean> opt = studentRepository.findById(id);
        StudentForm studentForm = new StudentForm();
        opt.ifPresent(student ->{
            BeanUtils.copyProperties(student, studentForm);
        });
        return studentForm;
    }
}