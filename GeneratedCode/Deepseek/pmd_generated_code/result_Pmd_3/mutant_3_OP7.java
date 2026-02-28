import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

class AvoidAccessibilityAlteration {
    private String aPrivateField = "Private Field";

    private void aPrivateMethod() {
        System.out.println("Private Method");
    }

    public void showBug() throws NoSuchMethodException, SecurityException {
        Constructor<?> constructor = this.getClass().getDeclaredConstructor();
        // BUG: AvoidAccessibilityAlteration
        constructor.setAccessible(true);

        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        // BUG: AvoidAccessibilityAlteration
        privateMethod.setAccessible(true);

        AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AvoidAccessibilityAlteration.class.getDeclaredField("aPrivateField");
                    // BUG: AvoidAccessibilityAlteration
                    field.setAccessible(true);

                    // Unreachable while loop starts here
                    boolean condition = false;
                    while (condition) {}  // Added unreachable while loop
                    // Unreachable while loop ends here

                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}