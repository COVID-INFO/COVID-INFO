package Models;

import Entities.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserModel {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public User getUser(String p){
        User user;
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            user = (User) session.createQuery("from User WHERE pesel = :pesel")
                    .setParameter("pesel", p)
                    .getSingleResult();

            transaction.commit();

        } catch (Exception e) {
            user = null;
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return user;
    }
    public ObservableList getListOfUsers()
    {
        ObservableList soldiers;
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            soldiers = FXCollections.observableArrayList(session.createQuery("from User").getResultList());

            transaction.commit();

        } catch (Exception e) {
            soldiers = null;
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return soldiers;
    }


    public void createUser(String pesel,String lastname)
    {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            User user = new User();
            user.setPesel(pesel);
            user.setLastName(lastname);
            user.setDead(0);
            user.setInfected(0);
            user.setQuarantine(0);
            user.setRecovered(0);
            session.save(user);

            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

}
