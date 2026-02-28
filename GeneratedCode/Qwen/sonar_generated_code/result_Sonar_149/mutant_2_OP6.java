import java.lang.reflect.Method;
import java.util.function.Function;

class AnnotationReflectionBug {

    // Method to demonstrate the bug
    public boolean showBug(Class<?> cls) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return cls.isAnnotationPresent(FunctionalInterface.class); // This is fine as FunctionalInterface has RUNTIME retention

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
    }

    public boolean showBug1(Method method) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return method.isAnnotationPresent(Override.class); // This is the bug as Override has SOURCE retention

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        
        // Demonstrating the bug with Override annotation
        Method hashCodeMethod = Integer.class.getMethod("hashCode");
        boolean result1 = bugDemo.showBug1(hashCodeMethod);
        System.out.println("Is hashCode method annotated with @Override? " + result1); // Expected: false
        
        // Demonstrating non-bug with FunctionalInterface annotation
        boolean result2 = bugDemo.showBug(Function.class);
        System.out.println("Is Function interface annotated with @FunctionalInterface? " + result2); // Expected: true

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }
}