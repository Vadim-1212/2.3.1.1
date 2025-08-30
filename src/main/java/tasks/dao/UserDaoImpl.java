package tasks.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import tasks.model.User;

import java.util.List;

@Repository

public class UserDaoImpl implements  UserDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public List<User> getAllUsers() {

        return  em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return  em.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUserById(int id) {
        em.remove(em.find(User.class, id));
        User user = em.find(User.class, id); // ищем в БД
        if (user != null) {
            em.remove(user); // удаляем
        }
    }
}
