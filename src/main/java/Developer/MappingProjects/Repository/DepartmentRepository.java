package Developer.MappingProjects.Repository;

import org.springframework.stereotype.Repository;

import Developer.MappingProjects.Entity.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository 
public class DepartmentRepository {

    @PersistenceContext 
    private EntityManager entityManager;

    public void saveDepartment(Department department){
        entityManager.persist(department);
    }
    public Department getDepartmentById(Long id){
       return entityManager.find(Department.class,id);
    }
    
}
