import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantSetterCallExampleTest {

    @Test
    public void testShowBug() {
        RedundantSetterCallExample.Copy copy = new RedundantSetterCallExample.Copy("firstValue", "secondValue");
        RedundantSetterCallExample example = new RedundantSetterCallExample();
        RedundantSetterCallExample.MyProto result = example.showBug(copy); // TRIGGER BUG: RedundantSetterCall

        // The test is expected to fail because the setFoo method is called twice,
        // and the second call overwrites the first one. Therefore, we expect the foo value
        // to be "secondValue" due to the bug.
        assertEquals("firstValue", getFooValue(result)); // This assertion is expected to fail
    }

    // Helper method to access the private field 'foo'
    private String getFooValue(RedundantSetterCallExample.MyProto myProto) {
        try {
            java.lang.reflect.Field field = myProto.getClass().getDeclaredField("foo");
            field.setAccessible(true);
            return (String) field.get(myProto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}