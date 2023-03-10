package Java_L_S_D_ooP.DZ.Dz_5.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_5.data.Student;
import Java_L_S_D_ooP.DZ.Dz_5.service.StudentService;

public class DeleteStudentExecutable implements CommandExecutable{
    
    private StudentService studentService;
    private Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student){
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute(){
        studentService.deleteStudent(student);
        System.out.println("Delete student: " + student.getFIO());
    }

}
