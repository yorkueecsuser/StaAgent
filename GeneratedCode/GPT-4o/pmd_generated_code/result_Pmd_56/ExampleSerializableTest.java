import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleSerializableTest {

    @Test
    public void testShowBug() {
        ExampleSerializable example = new ExampleSerializable("Alice", 30);
        example.showBug(); // TRIGGER BUG: MissingSerialVersionUID
    }
}