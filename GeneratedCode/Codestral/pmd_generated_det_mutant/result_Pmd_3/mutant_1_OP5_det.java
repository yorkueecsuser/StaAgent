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
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        constructor.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        constructor.newInstance();

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        int oeyugnxx = 0;switch  (oeyugnxx) {case 1:float cmzmzkgt = -365534864;break;default:char iuhzwuhm = 'o';break;}
        privateMethod.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        privateMethod.invoke(this);
    
}

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}