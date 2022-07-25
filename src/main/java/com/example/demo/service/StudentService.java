package com.example.demo.service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> findOne (Long studentId) {
        return studentRepository.findById(studentId);
    }

    public List<Student> findByName (String studentName) {
        return studentRepository.findByName(studentName);
    }

    public void addStudent (Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent (Long studentId) {
        studentRepository.deleteById (studentId);
    }
}
