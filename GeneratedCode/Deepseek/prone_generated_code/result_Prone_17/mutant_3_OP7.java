import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str);

        while (getCondition()) {
            System.out.println("This is an unreachable while loop");
        }

        System.out.println("This statement is unreachable");

        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }

    private boolean getCondition() {
        return false;
    }
}