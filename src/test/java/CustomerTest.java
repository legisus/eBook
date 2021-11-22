import com.eBook.entity.Customer;
import com.eBook.entity.Review;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setEmail("test@email.com");
        customer.setFullname("Fullname");
        customer.setAddress("Address");
        customer.setCity("City");
        customer.setCountry("Country");
        customer.setPhone("Phone");
        customer.setZipcode("ZipCode");
        customer.setPassword("Pass");
        //customer.setRegisterDate();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Customer persist Done");
    }
}
