package Developer.MappingProjects.Service;

import org.springframework.stereotype.Service;

import Developer.MappingProjects.Entity.Department;
import Developer.MappingProjects.Repository.DepartmentRepository;
import jakarta.transaction.Transactional;

@Service 
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;

    }

    @Transactional 
    public void createDepartment(Department department) {
        departmentRepository.saveDepartment(department);
    }

    
}
