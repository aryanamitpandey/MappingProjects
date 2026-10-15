package Developer.MappingProjects.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class Buyer {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long buyId;
    private String buyName;
    @ManyToMany(mappedBy = "buyers")
    
    private List<Seller>  seller = new ArrayList<>();

    public Buyer(){
        
    }
    public Buyer(Long buyId, String buyName, List<Seller> seller) {
        this.buyId = buyId;
        this.buyName = buyName;
        this.seller = seller;
    }
    
}
