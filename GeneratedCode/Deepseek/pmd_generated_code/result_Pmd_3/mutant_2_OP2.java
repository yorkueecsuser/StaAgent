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
        constructor.setAccessible(true); // Mutation: Duplication (Duplicating setAccessible)

        Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
        // BUG: AvoidAccessibilityAlteration
        privateMethod.setAccessible(true);
        privateMethod.setAccessible(true); // Mutation: Duplication (Duplicating setAccessible)

        AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AvoidAccessibilityAlteration.class.getDeclaredField("aPrivateField");
                    // BUG: AvoidAccessibilityAlteration
                    field.setAccessible(true);
                    field.setAccessible(true); // Mutation: Duplication (Duplicating setAccessible)
                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}