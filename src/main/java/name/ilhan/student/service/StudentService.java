package name.ilhan.student.service;

import name.ilhan.student.dto.StudentInput;
import name.ilhan.student.model.Student;
import name.ilhan.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(StudentInput studentInput) {
        Student student = new Student();
        student.setFirstName(studentInput.getFirstName());
        student.setLastName(studentInput.getLastName());
        return studentRepository.save(student);
    }
}