import org.junit.Test;
import static org.junit.Assert.*;

public class NonStaticInitializerExampleTest {

    @Test
    public void testNonStaticInitializerWithDefaultConstructor() {
        NonStaticInitializerExample example1 = new NonStaticInitializerExample(); // TRIGGER BUG: NonStaticInitializer
        assertEquals(1, example1.showBug()); // This should fail because the instanceCounter is incremented in the non-static initializer
    }

    @Test
    public void testNonStaticInitializerWithParameterizedConstructor() {
        NonStaticInitializerExample example2 = new NonStaticInitializerExample(10); // TRIGGER BUG: NonStaticInitializer
        assertEquals(10, example2.showBug()); // This should fail because the instanceCounter is incremented in the non-static initializer
    }
}