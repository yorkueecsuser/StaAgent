import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);

        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());

        // Unreachable while loop
        // This loop will never execute because the condition is always false
        while (false) {
            // Additional code to make the loop unreachable
            System.out.println("This code is unreachable");
        }
    }
}