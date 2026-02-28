import org.junit.Test;

public class UnusableClassTest {

    @Test(expected = IllegalAccessException.class)
    public void testShowBug() throws Exception {
        UnusableClass instance = null; // TRIGGER BUG: MissingStaticMethodInNonInstantiatableClass
        try {
            instance = UnusableClass.class.getDeclaredConstructor().newInstance();
            instance.showBug();
        } catch (IllegalAccessException e) {
            throw e;
        }
    }
}