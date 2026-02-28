import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityBugTest {
    @Test
    public void testModifyField() throws NoSuchFieldException, IllegalAccessException {
        SecurityBug securityBug = new SecurityBug();
        Field field = securityBug.getClass().getDeclaredField("protectedField");
        field.setAccessible(true);
        field.set(securityBug, 42);
        assertEquals(42, securityBug.protectedField);
    }

    @Test
    public void testShowBug() throws NoSuchFieldException, IllegalAccessException {
        SecurityBug securityBug = new SecurityBug();
        Field field = securityBug.getClass().getDeclaredField("protectedField");
        securityBug.showBug();
        assertEquals(42, securityBug.protectedField);
    }
}