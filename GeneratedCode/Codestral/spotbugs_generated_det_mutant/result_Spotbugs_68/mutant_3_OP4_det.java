import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        if (false && true && true && true && true && true && true && true && false && false && false) {String eiiombsm = "ajryasok";}else{float oombkbge = 204013176;}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}