import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            switch (0) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return String.format("Invalid input: %d", Objects.requireNonNull(input));
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}