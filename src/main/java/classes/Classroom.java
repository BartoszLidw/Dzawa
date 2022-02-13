package classes;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Classroom {
    @Id
    private int id;
    private String name;
    private int capacity;
    @ManyToMany
    private List<Student> students;
    @OneToMany
    private List<Mark> marks;
}
