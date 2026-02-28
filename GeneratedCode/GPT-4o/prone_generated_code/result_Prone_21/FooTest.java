import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FooTest {

    @Test
    public void testShowBug() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(3));
        fooList.add(new Foo(1));
        fooList.add(new Foo(2));

        List<Bar> barList = new ArrayList<>();
        barList.add(new Bar(3));
        barList.add(new Bar(1));
        barList.add(new Bar(2));

        BugDemo demo = new BugDemo();
        List<Foo> result = demo.showBug(fooList, barList); // TRIGGER BUG: ComparableType

        // Since the bug causes a ClassCastException,
        // the assertion below will not be reached, and the test will fail.
        assertEquals(3, result.size());
    }
}