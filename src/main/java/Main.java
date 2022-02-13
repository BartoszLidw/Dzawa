import classes.Classroom;
import classes.Dormitory;
import classes.Mark;
import classes.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Student poter = new Student("Harry", "Poter", Dormitory.Gryffindor);
        Student x = new Student("Marry", "Pery", Dormitory.Slytherin);
        Student y = new Student("Hanna", "Johansen", Dormitory.Hufflepuff);
        Student z = new Student("Parry", "Hoter", Dormitory.Ravenclaw);
        Classroom a = new Classroom("Herbalism", 12);
        Date today = new Date();
        Mark q = new Mark(a, poter, 10, "Mandragora Test", today);
        Mark w = new Mark(a, x, 70, "Mandragora Test", today);
        Mark e = new Mark(a, y, 50, "Mandragora Test", today);
        Mark r = new Mark(a, z, 30, "Mandragora Test", today);
        a.setStudent(poter);
        a.setStudent(x);
        a.setStudent(y);
        a.setStudent(z);
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Classroom.class).addAnnotatedClass(Mark.class);


        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(a);
        session.save(poter);
        session.save(x);
        session.save(y);
        session.save(z);
        session.save(q);
        session.save(w);
        session.save(e);
        session.save(r);
        tx.commit();

    }
}
