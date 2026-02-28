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

        Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(this);

        // Mutant code added based on Duplication operator
        Constructor<?> constructorMutant = this.getClass().getDeclaredConstructor();
        constructorMutant.setAccessible(true); // Duplicated line
        constructorMutant.newInstance();

        Method privateMethodMutant = this.getClass().getDeclaredMethod("privateMethod");
        privateMethodMutant.setAccessible(true); // Duplicated line
        privateMethodMutant.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        AccessibilityViolation violation = new AccessibilityViolation();
        violation.showBug();
    }
}