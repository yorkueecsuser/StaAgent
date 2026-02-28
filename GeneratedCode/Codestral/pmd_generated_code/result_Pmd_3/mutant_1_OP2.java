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
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        constructor.setAccessible(true); // Original statement

        constructor.setAccessible(true); // Mutant: Duplication of the above statement

        constructor.newInstance();

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // Original statement

        privateMethod.setAccessible(true); // Mutant: Duplication of the above statement

        privateMethod.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}