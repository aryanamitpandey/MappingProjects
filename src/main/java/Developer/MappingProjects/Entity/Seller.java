package Developer.MappingProjects.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class Seller {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long selId;
    private String selName;
    @ManyToMany 
    @JoinTable(name = "buyer_seller",
    joinColumns = @JoinColumn(name = "seller_id"),
    inverseJoinColumns= @JoinColumn(name = "buyer_id") )
    private List<Buyer> buyers = new ArrayList<>();

    public Seller(){

    }

    public Seller(Long selId, String selName, List<Buyer> buyers){
        this.selId = selId;
        this.selName = selName;
        this.buyers = buyers;
    }
    
}
