import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }

    // Unreachable if statement mutant
    public static void showBugMutant(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        if (false) {
            System.out.println(obj.toString());
        }
    }
}