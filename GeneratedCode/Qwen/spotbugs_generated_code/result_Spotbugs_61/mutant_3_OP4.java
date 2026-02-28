import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        // This method expects a non-null parameter but we pass null
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (getFalseCondition()) {
                System.out.println("This is an unreachable if block.");
            } else {
                System.out.println("This is an unreachable else block.");
            }
        }
        return Objects.requireNonNull(input).toUpperCase(); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    private boolean getCondition() {
        return true; // This ensures the if block is executed
    }

    private boolean getFalseCondition() {
        return false; // This ensures the if-else block inside is unreachable
    }

    public static void main(String[] args) {
        NullParameterDemo demo = new NullParameterDemo();
        try {
            System.out.println(demo.showBug(null));
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}