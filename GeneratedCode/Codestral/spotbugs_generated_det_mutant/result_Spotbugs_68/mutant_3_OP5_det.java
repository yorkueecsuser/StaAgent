import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        int pyqmupxb = 0;switch  (pyqmupxb) {case 1:String ptfnywok = "tbmwcpuk";break;default:double vkmsvbhx = -737190909;break;}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}