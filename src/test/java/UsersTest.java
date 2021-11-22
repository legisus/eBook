import com.eBook.entity.Users;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collections;

public class UsersTest {
    public static void main(String[] args) {
        Users user1 = new Users();
        user1.setFullName("test1");
        user1.setEmail("sdcwdc22@dwfv");
        user1.setPassword("pass");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop", Collections.emptyMap());
        EntityManager entityManager = entityManagerFactory.createEntityManager(Collections.emptyMap());
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(user1);
        entityTransaction.commit();
        if ( entityManager.isOpen() ) {
            entityManager.close();
        }
        if (entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
        System.out.println("Done");
    }
}
