import org.junit.Test;

public class SerializationExampleTest {

    @Test
    public void testMissingSerialVersionUID() {
        SerializationExample example = new SerializationExample();
        example.showBug(); // TRIGGER BUG: MissingSerialVersionUID
    }
}