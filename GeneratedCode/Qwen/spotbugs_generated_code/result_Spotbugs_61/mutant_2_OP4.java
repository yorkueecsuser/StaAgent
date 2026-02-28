import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        // This method expects a non-null parameter but we pass null
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code block
            System.out.println("This is an unreachable block");
        } else {
            // Another unreachable block
            System.out.println("This is another unreachable block");
        }
        return Objects.requireNonNull(input).toUpperCase(); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else blocks unreachable
        return false;
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