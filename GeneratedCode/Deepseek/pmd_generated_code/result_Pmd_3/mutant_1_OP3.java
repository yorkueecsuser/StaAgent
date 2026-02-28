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
        // Mutation: Replaced constructor.setAccessible(true) with a condition that will always be false
        if (1 > 2) {
            constructor.setAccessible(true);
        }

        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        // Mutation: Replaced privateMethod.setAccessible(true) with a condition that will always be false
        if (1 > 2) {
            privateMethod.setAccessible(true);
        }

        AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AvoidAccessibilityAlteration.class.getDeclaredField("aPrivateField");
                    // Mutation: Replaced field.setAccessible(true) with a condition that will always be false
                    if (1 > 2) {
                        field.setAccessible(true);
                    }
                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}