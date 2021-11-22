import com.eBook.entity.BookOrder;
import com.eBook.entity.OrderDeteil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OrderDetailTest {
    public static void main(String[] args) {
        OrderDeteil od = new OrderDeteil();
//        od.setQuantity();
//        od.setSubtotal();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(od);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("OrderDetail persist Done");
    }
}
