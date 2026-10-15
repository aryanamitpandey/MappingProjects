package Developer.MappingProjects.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Developer.MappingProjects.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository 
public class StudentRepository {

    @PersistenceContext 
    private EntityManager entityManager;


    @Transactional 
    public void saveStudent(Student student){
        entityManager.persist(student);
    }
   

    
}
