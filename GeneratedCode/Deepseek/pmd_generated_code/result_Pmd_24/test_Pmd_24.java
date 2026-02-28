import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void testShowBug() throws Exception {
        Foo foo = new Foo();
        foo.showBug(); // TRIGGER BUG: CloneMethodMustBePublic
    }
}