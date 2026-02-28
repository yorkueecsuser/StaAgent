// Java code demonstrating the "AvoidAccessibilityAlteration" bug with an unreachable while loop mutant
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
        // Unreachable while loop mutant
        while (getUnreachableCondition()) {
            // This code will never execute
        }

        // Bug: Calling setAccessible(true) to access private constructor and method
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        constructor.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        constructor.newInstance();

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        privateMethod.invoke(this);
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the while loop unreachable
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}