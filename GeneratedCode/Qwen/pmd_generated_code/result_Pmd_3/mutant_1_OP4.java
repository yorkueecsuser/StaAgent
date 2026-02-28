import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

class AccessibilityAlterationExample {

    private String aPrivateField = "This is a private field";

    private void aPrivateMethod() {
        System.out.println("This is a private method");
    }

    public String showBug() throws NoSuchMethodException, SecurityException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // Deliberate accessibility alteration
        String privateField = AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AccessibilityAlterationExample.class.getDeclaredField("aPrivateField");
                    field.setAccessible(true); // BUG: AvoidAccessibilityAlteration
                    return (String) field.get(AccessibilityAlterationExample.this);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Forbidden setAccessible call
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        constructor.setAccessible(true); // BUG: AvoidAccessibilityAlteration

        // Forbidden setAccessible call
        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        privateMethod.setAccessible(true); // BUG: AvoidAccessibilityAlteration
        privateMethod.invoke(this);

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable if block");
        } else {
            // This block will always execute
            System.out.println("This is the reachable else block");
        }

        return privateField;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        try {
            AccessibilityAlterationExample example = new AccessibilityAlterationExample();
            String result = example.showBug();
            System.out.println("Retrieved private field value: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}