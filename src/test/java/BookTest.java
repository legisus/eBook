import com.eBook.entity.Book;
import com.eBook.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("title");
        book.setAuthor("testAuthor");
        book.setDescription("desc");
        book.setIsbn("ISBN");
//        book.setImage();
        book.setPrice(1f);
//        book.setPublished();
//        book.setLastUpdateTime();



        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Book persist Done");
    }
}
