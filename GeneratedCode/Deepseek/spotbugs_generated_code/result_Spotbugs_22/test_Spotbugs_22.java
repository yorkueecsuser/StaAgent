import org.junit.Test;
import static org.junit.Assert.*;

public class ClassComparisonBugTest {

    @Test
    public void testShowBug() throws Exception {
        ClassLoader loader1 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        ClassLoader loader2 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                if (name.equals("ClassComparisonBug")) {
                    return super.loadClass(name);
                }
                return null;
            }
        };

        Class<?> clazz1 = loader1.loadClass("ClassComparisonBug");
        Class<?> clazz2 = loader2.loadClass("ClassComparisonBug");

        Object obj1 = clazz1.getDeclaredConstructor(String.class).newInstance("Object 1");
        Object obj2 = clazz2.getDeclaredConstructor(String.class).newInstance("Object 2");

        ClassComparisonBug testObj = new ClassComparisonBug("Test Object");
        testObj.showBug(obj1); // TRIGGER BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        testObj.showBug(obj2); // TRIGGER BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)

        // Both assertions are expected to fail, indicating the bug
        assertFalse(testObj.equals(obj1));
        assertFalse(testObj.equals(obj2));
    }
}