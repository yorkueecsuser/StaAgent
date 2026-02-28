import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }
    
    // Renaming user-defined variables declared in a program
    // The new name of the variable will be in the form of [a-z]
    public static void showBug(Object obj1) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj1);
        Objects.requireNonNull(obj1);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj1.toString());
    }
}