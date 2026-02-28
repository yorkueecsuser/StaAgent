import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private boolean shouldRun;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str);
        for (int i = 0; shouldRun; i++) {
            // Unreachable code
        }
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}