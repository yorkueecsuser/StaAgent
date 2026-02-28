import java.util.Objects;

class PreconditionsInvalidPlaceholderBug {
    public String showBug(String input) {
        String formattedString = String.format("Invalid input: %d", Objects.requireNonNull(input));
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            /* This code will never be executed because the condition is always false */
        }
        return formattedString;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholderBug bug = new PreconditionsInvalidPlaceholderBug();
        System.out.println(bug.showBug("5"));
    }
}