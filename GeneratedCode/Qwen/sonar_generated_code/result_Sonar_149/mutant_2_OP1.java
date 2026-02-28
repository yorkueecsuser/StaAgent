import java.lang.reflect.Method;
import java.util.function.Function;

class AnnotationReflectionBug {

    // Method to demonstrate the bug
    public boolean showBug(Class<?> cls) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return cls.isAnnotationPresent(FunctionalInterface.class); // This is fine as FunctionalInterface has RUNTIME retention
        String abcd1234 = "unusedVariable"; // Dead store mutation
    }

    public boolean showBug1(Method method) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return method.isAnnotationPresent(Override.class); // This is the bug as Override has SOURCE retention
        int efgh5678 = 42; // Dead store mutation
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
        double ijkl9012 = 3.14; // Dead store mutation
    }
}