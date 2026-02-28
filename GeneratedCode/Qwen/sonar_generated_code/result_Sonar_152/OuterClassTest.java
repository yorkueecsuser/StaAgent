import org.junit.Test;
import static org.junit.Assert.*;

public class OuterClassTest {

    @Test
    public void testNonStaticSerializableInnerClass() {
        OuterClass outer = new OuterClass();
        outer.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }
}