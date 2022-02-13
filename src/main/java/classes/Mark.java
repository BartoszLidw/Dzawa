package classes;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private double points;
    private String comment;
    private Date date;

    public Mark(Classroom classroom, Student student, double points, String comment, Date date){
        this.classroom = classroom;
        this.student = student;
        this.points = points;
        this.comment = comment;
        this.date = date;
        student.addMark(this);
        classroom.addMark(this);
    }

    public Mark() {

    }

    public Student getStudent() {
        return student;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}