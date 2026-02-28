import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

public class MainClassTest {

    @Test
    public void testShowBug() throws NoSuchFieldException, IllegalAccessException {
        MainClass mainClass = new MainClass();
        Field field = MainClass.class.getDeclaredField("injectedClass");
        field.setAccessible(true);
        InjectedClass initialInjectedClass = (InjectedClass) field.get(mainClass);
        int initialValue = initialInjectedClass.getValue();
        field.set(mainClass, new InjectedClassWithDifferentValue()); // TRIGGER BUG: GuiceInjectOnFinalField
        mainClass.showBug();
        int newValue = initialInjectedClass.getValue();
        assertNotEquals(initialValue, newValue);
    }

    private static class InjectedClassWithDifferentValue extends InjectedClass {
        public InjectedClassWithDifferentValue() {
            super();
            this.value = 100; // Different value to trigger the bug
        }
    }
}