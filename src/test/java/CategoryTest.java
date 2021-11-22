import com.eBook.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryTest {

    public static void main(String[] args) {
        Category category = new Category();
        category.setName("test6");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Category persist Done");
    }
}
