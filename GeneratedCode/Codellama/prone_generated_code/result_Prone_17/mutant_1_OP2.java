import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);

        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }

    // Mutant 1: Duplication of the first assignment statement
    public static void showBug1(Object obj) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);

        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }

    // Mutant 2: Duplication of the second assignment statement
    public static void showBug2(Object obj) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj);

        // This is the line of code that is intended to demonstrate the bug
        System.out.println(obj.toString());
    }
}