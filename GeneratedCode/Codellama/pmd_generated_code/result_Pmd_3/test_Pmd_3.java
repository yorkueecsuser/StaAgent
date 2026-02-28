import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class AvoidAccessibilityAlterationBugTest {

    @Test
    public void testBugTrigger() {
        AvoidAccessibilityAlterationBug buggy = new AvoidAccessibilityAlterationBug("John", 30);
        try {
            Method getNameMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getName");
            getNameMethod.setAccessible(true);
            String name = (String) getNameMethod.invoke(buggy);
            // TRIGGER BUG: AvoidAccessibilityAlteration
            System.out.println(name);

            Method setNameMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setName", String.class);
            setNameMethod.setAccessible(true);
            setNameMethod.invoke(buggy, "Jane");
            // TRIGGER BUG: AvoidAccessibilityAlteration
            System.out.println(buggy.getName());

            Method getAgeMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getAge");
            getAgeMethod.setAccessible(true);
            int age = (int) getAgeMethod.invoke(buggy);
            // TRIGGER BUG: AvoidAccessibilityAlteration
            System.out.println(age);

            Method setAgeMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setAge", int.class);
            setAgeMethod.setAccessible(true);
            setAgeMethod.invoke(buggy, 35);
            // TRIGGER BUG: AvoidAccessibilityAlteration
            System.out.println(buggy.getAge());
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
}