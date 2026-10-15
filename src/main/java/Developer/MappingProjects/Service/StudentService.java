package Developer.MappingProjects.Service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Developer.MappingProjects.Entity.Department;
import Developer.MappingProjects.Entity.Student;
import Developer.MappingProjects.Repository.DepartmentRepository;
import Developer.MappingProjects.Repository.StudentRepository;

@Service 
public class StudentService {

    private StudentRepository studentRepository;
    private DepartmentRepository departmentRepository;

    public StudentService(StudentRepository studentRepository, DepartmentRepository departmentRepository){
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }

    @Transactional 
    public void createStudent(Student student, Long id){
        Department department = departmentRepository.getDepartmentById(id);

        student.setDepartment(department);
        department.getStudents().add(student);
        
         studentRepository.saveStudent(student);
    }

    @Transactional  
    public void createStudent(Student student, String deptName){
        Department department = new Department();
        department.setName(deptName);
        student.setDepartment(department);
        department.getStudents().add(student);
        departmentRepository.saveDepartment(department);
        student.setDepartment(department);

        studentRepository.saveStudent(student);

    }
    
}
