import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            this.str = Objects.requireNonNull(this.str); // Mutant: CheckNotNullMultipleTimes
        } else {
            // This block is unreachable but is necessary to avoid unreachable statement error
            this.str = "Default string";
        }
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}