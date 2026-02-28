import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }
}

// Unreachable switch statement mutant
class CheckNotNullMultipleTimesMutant {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
        
        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // Code that is dead, but not unreachable
                System.out.println("This code is dead, but not unreachable");
                break;
            default:
                // Code that is unreachable
                System.out.println("This code is unreachable");
                break;
        }
    }
}