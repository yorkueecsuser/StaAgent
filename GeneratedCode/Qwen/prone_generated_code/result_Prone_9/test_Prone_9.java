import org.junit.Test;
import static org.junit.Assert.*;

public class UserCreatorTest {

    @Test
    public void testProductBuilderDefaultsInConstructor() {
        UserCreator userCreator = new UserCreator();
        UserCreator.Product product = userCreator.showBug(); // TRIGGER BUG: AutoValueBuilderDefaultsInConstructor
        assertEquals("Default Product", product.productName());
        assertEquals(9.99, product.price(), 0.01);
    }
}