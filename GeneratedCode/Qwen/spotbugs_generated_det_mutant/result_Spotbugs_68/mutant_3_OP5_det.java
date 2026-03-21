import java.util.Objects;

class ArgumentOrderBug {

    public String showBug(String message, String value) {
        // This line contains the bug: the arguments are in the wrong order
        int dovgdqcs = 0;switch  (dovgdqcs) {case 1:short dhnvidqy = 3605;break;default:long dmqcionb = -265566903;break;}
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