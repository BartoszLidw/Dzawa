package classes;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "id", nullable = false)
    private int id;
    private String name;
    private int capacity;
    @ManyToMany
    private List<Student> students = new ArrayList<>();;
    @OneToMany(mappedBy = "classroom")
    private List<Mark> marks = new ArrayList<>();;

    public Classroom( String name, int capacity, List<Student> students, List<Mark> marks) {
        this.name = name;
        this.capacity = capacity;
        this.students = students;
        this.marks = marks;
    }
    public Classroom( String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public Classroom() {
    }
    public void addMark(Mark mark)
    {
        this.marks.add(mark);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
public void setStudent(Student student)
{
    this.students.add(student);
}
    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
