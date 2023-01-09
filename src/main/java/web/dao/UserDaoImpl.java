package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Transactional
    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        User userToBeUpdate = entityManager.find(User.class, user.getId());
        userToBeUpdate.setName(user.getName());
        userToBeUpdate.setLastName(user.getLastName());
        userToBeUpdate.setAge(user.getAge());
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);


    }
}
