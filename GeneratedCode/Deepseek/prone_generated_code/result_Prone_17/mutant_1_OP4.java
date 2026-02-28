import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private boolean shouldRun;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str); // BUG: CheckNotNullMultipleTimes
        if (shouldRun) { // Unreachable if-else
            return this.str.toLowerCase();
        } else {
            return "Unreachable";
        }
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}