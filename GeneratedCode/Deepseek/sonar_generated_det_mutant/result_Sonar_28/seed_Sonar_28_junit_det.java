import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.function.Consumer;

class AssertJBug {
    public void showBug() {
        Consumer<String> consumer = s -> "Hello".equals(s); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        Assertions.assertThat("Hello").isInstanceOfSatisfying(String.class, consumer);
    }

    @Test
    public void testBug() {
        showBug();
    }
}