import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        boolean shouldGoThrough = false; // Unreachable if-else statement
        if (shouldGoThrough) {
            this.str = Objects.requireNonNull(this.str);
        } else {
            System.out.println("This code is unreachable");
        }
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}