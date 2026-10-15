package Developer.MappingProjects.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter 
public class Profile {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bio;
    @OneToOne 
    @JoinColumn(name = "user_id")
    private User user;

    public Profile(){

    }
    public Profile(Long id, String bio, User user) {
        this.id = id;
        this.bio = bio;
        this.user = user;
    }
    
    
}
