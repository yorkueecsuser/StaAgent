// Java code demonstrating the "AvoidAccessibilityAlteration" bug with an additional unreachable for loop
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
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        constructor.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        constructor.newInstance();

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        privateMethod.invoke(this);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}