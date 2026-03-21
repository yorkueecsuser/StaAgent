import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        for  (int tpjfwkuy = 0; tpjfwkuy < 0; tpjfwkuy++) {char ubaimccl = 'n';}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}