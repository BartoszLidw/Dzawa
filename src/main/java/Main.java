import classes.Classroom;
import classes.Dormitory;
import classes.Mark;
import classes.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student poter = new Student(1,"Harry", "Poter", Dormitory.Gryffindor);
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Classroom.class).addAnnotatedClass(Mark.class);


        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(poter);
        tx.commit();

    }
}
