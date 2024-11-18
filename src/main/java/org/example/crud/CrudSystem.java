package org.example.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.example.entity.Human;
import org.example.utils.HibernateUtil;

import java.util.List;

public class CrudSystem {

    // Create
    public void saveHuman(Human human) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(human);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Read
    public Human getHumanById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Human.class, id);
        }
    }

    // Update
    public void updateHuman(Human human) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(human);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Delete
    public void deleteHuman(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Human human = session.get(Human.class, id);
            if (human != null) {
                session.delete(human);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // List all
    public List<Human> getAllHumans() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Human", Human.class).list();
        }
    }
}
