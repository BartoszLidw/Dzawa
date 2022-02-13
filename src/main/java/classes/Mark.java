package classes;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Mark {
    @Id
    private int MarkId;
    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private double points;
    private String comment;
    private Date date;

    public Student getStudent() {
        return student;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}