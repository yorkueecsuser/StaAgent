import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        // Introducing a benign do-while loop as per the mutation operator description
        int i = 0;
        do {
            // This loop does nothing meaningful
            i++;
        } while (i < 0); // Condition is false, so the loop does not execute

        // This method expects a non-null parameter but we pass null
        return Objects.requireNonNull(input).toUpperCase(); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
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