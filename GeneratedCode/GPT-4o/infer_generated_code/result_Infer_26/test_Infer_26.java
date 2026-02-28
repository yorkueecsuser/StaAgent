import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class ImpureFunctionExampleTest {

    @Test
    public void testShowBug() {
        List<Foo> fooList = new ArrayList<>();
        fooList.add(new Foo(1));
        fooList.add(new Foo(2));
        fooList.add(new Foo(3));

        ImpureFunctionExample example = new ImpureFunctionExample();
        List<Foo> resultList = example.showBug(fooList); // TRIGGER BUG: IMPURE_FUNCTION

        for (Foo foo : resultList) {
            assertEquals(0, foo.x); // TRIGGER BUG: IMPURE_FUNCTION
        }
    }
}