import org.junit.Test;

public class NonSerializableClassExampleTest {

    @Test
    public void testBug() {
        NonSerializableClassExample example = new NonSerializableClassExample(new Object());
        assertNotNull(example.nonSerializableField);
    }
}