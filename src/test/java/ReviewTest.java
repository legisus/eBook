import com.eBook.entity.Book;
import com.eBook.entity.Category;
import com.eBook.entity.Review;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReviewTest{
    public static void main(String[] args) {
        Review review = new Review();
//        review.setBookId();
//        review.setCustomerId();
//        review.setRating();
//        review.setHeadline();
//        review.setComment();
//        review.setReviewTime();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bookShop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(review);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Review persist Done");
    }
}
