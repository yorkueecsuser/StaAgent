import java.lang.reflect.Method;
import java.util.function.Function;

class AnnotationReflectionBug {

    // Method to demonstrate the bug
    public boolean showBug(Class<?> cls) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return cls.isAnnotationPresent(FunctionalInterface.class); // This is fine as FunctionalInterface has RUNTIME retention
        boolean result = cls.isAnnotationPresent(FunctionalInterface.class); // Mutant: Duplicate assignment
    }

    public boolean showBug1(Method method) {
        // BUG: Reflection should not be used to check non-runtime annotations
        return method.isAnnotationPresent(Override.class); // This is the bug as Override has SOURCE retention
        boolean result = method.isAnnotationPresent(Override.class); // Mutant: Duplicate assignment
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationReflectionBug bugDemo = new AnnotationReflectionBug();
        
        // Demonstrating the bug with Override annotation
        Method hashCodeMethod = Integer.class.getMethod("hashCode");
        boolean result1 = bugDemo.showBug1(hashCodeMethod);
        System.out.println("Is hashCode method annotated with @Override? " + result1); // Expected: false
        boolean result1Duplicate = bugDemo.showBug1(hashCodeMethod); // Mutant: Duplicate assignment

        // Demonstrating non-bug with FunctionalInterface annotation
        boolean result2 = bugDemo.showBug(Function.class);
        System.out.println("Is Function interface annotated with @FunctionalInterface? " + result2); // Expected: true
        boolean result2Duplicate = bugDemo.showBug(Function.class); // Mutant: Duplicate assignment
    }
}