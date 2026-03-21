import java.util.Objects;

class NullParameterDemo {

    public String showBug(String input) {
        boolean sfridsmu = false;while (sfridsmu && false && false && false && false && false && true && true && false && false && false && false) {short kaenthqm = 8612;}
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