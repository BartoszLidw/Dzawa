package classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String surname;
    private Dormitory dormitory;
    @ManyToMany(mappedBy = "students")
    private List<Classroom> classes = new ArrayList<>();;
    @OneToMany(mappedBy = "student")
    private List<Mark> marks = new ArrayList<>();;




    public Student() {
    }
    public Student(String name, String surname, Dormitory dormitory)
    {
        id = id;
        this.name = name;
        this.surname = surname;
        this.dormitory = dormitory;
    }

    public void addMark(Mark mark)
    {
        this.marks.add(mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
