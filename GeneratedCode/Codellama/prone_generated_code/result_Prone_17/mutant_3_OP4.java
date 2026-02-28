import java.util.Objects;

class CheckNotNullMultipleTimes {
    public static void showBug(Object obj) {
        // BUG: CheckNotNullMultipleTimes
        Objects.requireNonNull(obj);
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reached unreachable code!");
        } else {
            Objects.requireNonNull(obj);
            System.out.println(obj.toString());
        }
    }

    private static boolean getCondition() {
        return false;
    }
}