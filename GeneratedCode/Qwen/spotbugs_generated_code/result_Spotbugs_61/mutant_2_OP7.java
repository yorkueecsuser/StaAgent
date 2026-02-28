import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        // This method expects a non-null parameter but we pass null
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        return Objects.requireNonNull(input).toUpperCase(); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }

    private boolean getCondition() {
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