import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private boolean condition = false;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        if (this.condition) {
            System.out.println("This statement will never be reached, due to the mutation.");
        }
        this.str = Objects.requireNonNull(this.str); // Mutated code
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}