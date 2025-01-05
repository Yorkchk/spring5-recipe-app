package guru.springframework.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String categoryName;

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes;
}
