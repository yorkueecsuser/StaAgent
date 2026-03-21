import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        if (false && false && true && false && true && false && false && false && true && true && false) {char psgmpnyn = 'q';}else{short icvafojw = -4994;}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}