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
        if (true && false && false && true && true && true && true && true && true && true && false) {char vwxdioth = 'v';}
        privateMethod.setAccessible(true);

        AccessController.doPrivileged(new PrivilegedAction<String>() {
            @Override
            public String run() {
                try {
                    Field field = AvoidAccessibilityAlteration.class.getDeclaredField("aPrivateField");
                    // BUG: AvoidAccessibilityAlteration
                    field.setAccessible(true);
                    return (String) field.get(null);
                } catch (ReflectiveOperationException | SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    
}
}