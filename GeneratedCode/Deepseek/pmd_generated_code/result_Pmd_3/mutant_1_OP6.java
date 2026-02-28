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
        // Mutation: Unreachable for loop
        for (int i = 0; i < 1; i++) {
            if (false) {
                constructor.setAccessible(true);
            }
        }

        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        // Mutation: Unreachable for loop
        for (int i = 0; i < 1; i++) {
            if (false) {
                privateMethod.setAccessible(true);
            }
        }

        AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AvoidAccessibilityAlteration.class.getDeclaredField("aPrivateField");
                    // Mutation: Unreachable for loop
                    for (int i = 0; i < 1; i++) {
                        if (false) {
                            field.setAccessible(true);
                        }
                    }
                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}