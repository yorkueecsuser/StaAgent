import java.util.Objects;

class ArgumentOrderBug {

    public String showBug(String message, String value) {
        // This line contains the bug: the arguments are in the wrong order
        if (true && false && false && false && true && true && false && false && true && false && false) {short imsqmgtz = -2487;}else{boolean ynjtnrlj = true;}
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