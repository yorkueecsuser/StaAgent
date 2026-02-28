import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }
    
    // Mutant 1: Renaming the variable "obj" to "a"
    public static void showBug(Object a) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(a);
        Objects.requireNonNull(a);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(a.toString());
    }
}