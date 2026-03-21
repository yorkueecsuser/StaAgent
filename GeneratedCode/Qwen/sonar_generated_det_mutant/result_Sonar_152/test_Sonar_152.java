import org.junit.Test;
import static org.junit.Assert.*;

public class SerializableInnerClassExampleTest {

    @Test
    public void testNonStaticSerializableInnerClass() {
        SerializableInnerClassExample example = new SerializableInnerClassExample();
        example.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }
}