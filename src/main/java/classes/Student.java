package classes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private int Id;
    private String name;
    private String surname;
    private Dormitory dormitory;
    @ManyToMany
    private List<Classroom> classes;
    @OneToMany
    private List<Mark> marks;




    public Student() {
        this.name = " name ";
        this.surname = " surname ";
    }
    public Student(int id, String name, String surname, Dormitory dormitory)
    {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.dormitory = dormitory;
    }
    public Student(int id, String name, String surname, List<Classroom> classes, List<Mark> marks) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.classes = classes;
        this.marks = marks;
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
