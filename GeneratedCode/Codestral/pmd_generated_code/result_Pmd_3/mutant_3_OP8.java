// Java code demonstrating the "AvoidAccessibilityAlteration" bug
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class AccessibilityViolation {
    private AccessibilityViolation() {
        // Private constructor
    }

    private void privateMethod() {
        // Private method
        System.out.println("This is a private method.");
    }

    public void showBug() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // Bug: Calling setAccessible(true) to access private constructor and method
        Constructor<?> c = this.getClass().getDeclaredConstructor();
        c.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        c.newInstance();

        Method m = this.getClass().getDeclaredMethod("privateMethod");
        m.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        m.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}