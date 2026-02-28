import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantFieldInitializerExampleTest {

    @Test
    public void testRedundantFieldInitializations() {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        String result = example.showBug(); // TRIGGER BUG: RedundantFieldInitializer

        // The test will fail because we expect the output to be different if the fields were not initialized
        // However, since the fields are initialized with their default values, the output will be as expected.
        // To trigger the bug, we need to assert something that would fail if the fields were not initialized.
        // Here, we assert the presence of the default values in the output string, which will pass.
        // To make the test fail and trigger the bug, we can assert something that should not be there if the fields were not initialized.
        assertFalse(result.contains("boolean b: true")); // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("byte by: 1"));     // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("short s: 1"));     // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("char c: a"));      // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("int i: 1"));       // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("long l: 1"));      // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("float f: 1.0"));   // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("double d: 1.0"));  // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("Object o: someObject")); // TRIGGER BUG: RedundantFieldInitializer
        assertFalse(result.contains("MyClass mca: someMyClass")); // TRIGGER BUG: RedundantFieldInitializer
    }
}