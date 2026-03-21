import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        boolean lmxnywgv = false;while (lmxnywgv && true && true && false && true && true && false && true && false && true && false && false) {short euaujvbd = 4768;}
        // This method expects a non-null parameter but we pass null
        return Objects.requireNonNull(input).toUpperCase(); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    
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