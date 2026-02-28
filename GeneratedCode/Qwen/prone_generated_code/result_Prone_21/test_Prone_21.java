import org.junit.Test;
import static org.junit.Assert.*;

public class ComparableTypeBugTest {

    @Test
    public void testCompareToDifferentTypes() {
        ComparableTypeBug bugDemo = new ComparableTypeBug();
        Foo foo = new Foo(10);
        Bar bar = new Bar(5);
        bugDemo.showBug(foo, bar); // TRIGGER BUG: ComparableType
    }
}