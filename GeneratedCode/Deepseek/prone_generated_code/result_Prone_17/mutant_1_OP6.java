import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private boolean condition;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
        this.condition = false;
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str);
        this.condition = getCondition();
        for (;!this.condition; ) {
            // unreachable code
        }
        return this.str.toLowerCase();
    }

    private boolean getCondition() {
        // this function will always return false
        return false;
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}