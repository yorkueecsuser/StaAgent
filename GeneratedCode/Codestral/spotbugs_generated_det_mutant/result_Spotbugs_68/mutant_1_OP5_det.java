import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        int wdatbrkh = 0;switch  (wdatbrkh) {case 1:float urwswcob = 658190208;break;default:boolean cnyvykef = true;break;}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}