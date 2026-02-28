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

        Method p = this.getClass().getDeclaredMethod("privateMethod");
        p.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        p.invoke(this);
    }

    // Mutation: Renaming user-defined variables
    public void showMutant() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?> a = this.getClass().getDeclaredConstructor();
        a.setAccessible(true); // Mutant: AvoidAccessibilityAlteration
        a.newInstance();

        Method b = this.getClass().getDeclaredMethod("privateMethod");
        b.setAccessible(true); // Mutant: AvoidAccessibilityAlteration
        b.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
        // Invoking the mutated method
        violation.showMutant();
    }
}