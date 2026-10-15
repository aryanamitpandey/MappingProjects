package Developer.MappingProjects.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Developer.MappingProjects.Entity.Student;
import Developer.MappingProjects.Service.StudentService;

@RestController 
@RequestMapping("/api/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> createStudent(@RequestBody Student student, @PathVariable  Long id){
        studentService.createStudent(student,id);
        return ResponseEntity.ok("Done it");
    }
    @PostMapping("/withDepartment")
    public ResponseEntity<String> createStudent(@RequestBody Student student,@RequestParam String deptName){
        studentService.createStudent(student, deptName);
        return ResponseEntity.ok("Done it");
    }
    
}
