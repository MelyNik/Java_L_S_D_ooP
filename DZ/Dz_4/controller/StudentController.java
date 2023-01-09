package Java_L_S_D_ooP.DZ.Dz_4.controller;

import Java_L_S_D_ooP.DZ.Dz_4.data.Student;
import Java_L_S_D_ooP.DZ.Dz_4.service.StudentService;

public class StudentController implements InterfaceController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.saveStudent(student);
    }

    @Override
    public Student find(Integer id) {
        return studentService.findStudentById(id);
    }
}
