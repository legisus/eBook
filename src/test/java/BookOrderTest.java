import com.eBook.entity.Book;
import com.eBook.entity.BookOrder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookOrderTest {
    public static void main(String[] args) {
        BookOrder bo = new BookOrder();
//        bo.setOrderDate();
//        bo.setShippingAddress();
//        bo.setRecipientName();
//        bo.setRecipientPhone();
//        bo.setPaymentMethod();
//        bo.setTotal();
//        bo.setStatus();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bo);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("BookOrder persist Done");
    }
}
