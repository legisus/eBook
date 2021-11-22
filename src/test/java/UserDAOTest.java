import com.eBook.dao.UserDAO;
import com.eBook.entity.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;

import java.util.List;

import static org.junit.Assert.*;

public class UserDAOTest {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static UserDAO userDAO;

    @Before
    public void beforeAll() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        entityManager = entityManagerFactory.createEntityManager();

        userDAO = new UserDAO(entityManager);
    }

    @Test
    public void testCreateUsers() {
        Users user1 = new Users();
        user1.setFullName("testUserDAO2");
        user1.setEmail("userDao@dwfv2");
        user1.setPassword("pass2");

        user1 = userDAO.create(user1);

        assertTrue(user1.getUserId() > 0);
    }

    @Test(expected = PersistenceException.class)
    public void testCreateUsersFieldsNotSet() {
        Users user1 = new Users();

        user1 = userDAO.create(user1);
    }

    @Test
    public void testGetUsersFound() {
        Integer userId = 1;
        Users users = userDAO.get(userId);

        if (users != null) {
            System.out.println(users.getEmail());
        }
        assertNotNull(userId);
    }

    @Test
    public void testGetUsersNotFound() {
        Integer usedId = 99;
        Users user = userDAO.get(usedId);
        assertNull(user);
    }

    @Test
    public void deleteUser() {
        Integer userId = 5;
        userDAO.delete(userId);

        Users user = userDAO.get(userId);

        assertNull(user);
    }

    @Test(expected = Exception.class)
    public void deleteNotExistUser() {
        Integer userId = 55;
        userDAO.delete(userId);
    }

    @Test
    public void testListAll() {
        List<Users> usersList = userDAO.listAll();
        for (Users user : usersList) {
            System.out.println(user.getFullName() +" "+ user.getEmail());
        }
        assertTrue(usersList.size() > 0);
    }

    @Test
    public void testCountUsers() {
        long totalUsers = userDAO.count();
        assertEquals(12, totalUsers);
    }


    @After
    public void after() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
