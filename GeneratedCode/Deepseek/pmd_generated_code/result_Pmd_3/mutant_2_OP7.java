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
        // Mutation: Using non-final variable instead of compile-time constant false.
        boolean condition = false;
        while (condition) {
            // Mutation: Adding an unreachable while loop.
            condition = true;
        }
        constructor.setAccessible(true);

        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        privateMethod.setAccessible(true);

        AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AvoidAccessibilityAlteration.class.getDeclaredField("aPrivateField");
                    // Mutation: Using non-final variable instead of compile-time constant false.
                    boolean fieldCondition = false;
                    while (fieldCondition) {
                        // Mutation: Adding an unreachable while loop.
                        fieldCondition = true;
                    }

                    field.setAccessible(true);
                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}