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
        constructor.setAccessible(true);
        constructor.newInstance();

        // Inserted unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This case will never be reached.");
                break;
        }

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(this);
    }

    private int getValue() {
        // This method will always return 0, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}