import java.util.Objects;

class ArgumentOrderBug {

    public String showBug(String message, String value) {
        // This line contains the bug: the arguments are in the wrong order
        if (true && false && true && true && false && true && false && false && false && false && false) {short wlsrcizu = -7442;}
        Objects.requireNonNull("message", value); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        return value;
    
}

    public static void main(String[] args) {
        ArgumentOrderBug bugDemo = new ArgumentOrderBug();
        try {
            System.out.println(bugDemo.showBug("This is a message", null));
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}