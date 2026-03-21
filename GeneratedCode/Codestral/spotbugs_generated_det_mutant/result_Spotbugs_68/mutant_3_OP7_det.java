import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        boolean jxgeoktz = false;while (jxgeoktz && false && true && true && true && true && true && false && true && false && true && false) {int dehiqlpb = 597223285;}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}