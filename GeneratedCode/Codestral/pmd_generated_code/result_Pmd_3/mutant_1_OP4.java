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

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making the if-else branch unreachable
    }

    public void showBug() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // Bug: Calling setAccessible(true) to access private constructor and method
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        constructor.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        constructor.newInstance();

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        privateMethod.invoke(this);

        // Mutation: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This code should never be executed.");
        } else {
            System.out.println("This code is always executed.");
        }
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}