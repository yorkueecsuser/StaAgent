import java.util.Objects;

class ArgumentOrderBug {

    public String showBug(String message, String value) {
        // This line contains the bug: the arguments are in the wrong order
        int ryiueksr = 0;switch  (ryiueksr) {case 1:short wjqquccu = -2406;break;default:float bybatlmq = 477913714;break;}
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