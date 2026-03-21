import java.util.Objects;

class NullParameterExample {

    public void printMessage(String message) {
        // Assume this method requires message to be non-null
        System.out.println(message);
    }

    public String showBug() {
        String dyrifdxt = null;
        printMessage(dyrifdxt); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
        return dyrifdxt;
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}