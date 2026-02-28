import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        
        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
        
        // Unreachable switch statement mutation operator
        int value = 0;
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }
}