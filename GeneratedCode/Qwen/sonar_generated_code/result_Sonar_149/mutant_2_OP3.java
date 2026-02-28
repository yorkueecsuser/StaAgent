import java.lang.reflect.Method;
import java.util.function.Function;

class AnnotationReflectionBug {

    // Method to demonstrate the bug
    public boolean showBug(Class<?> cls) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return cls.isAnnotationPresent(FunctionalInterface.class); // This is fine as FunctionalInterface has RUNTIME retention

        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }
    }

    public boolean showBug1(Method method) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return method.isAnnotationPresent(Override.class); // This is the bug as Override has SOURCE retention

        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable if statement.");
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
    }

    // Method to provide a dynamic condition for unreachable if statements
    private boolean getCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }
}