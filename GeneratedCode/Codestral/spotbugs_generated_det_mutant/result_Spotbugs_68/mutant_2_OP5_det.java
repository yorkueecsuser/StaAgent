import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }

    public static void showBug() {
        String message = "Hello, World!";
        // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        int sokgaqpe = 0;switch  (sokgaqpe) {case 1:String ywoaznrm = "tpjcwpyc";break;default:byte vlhkdbye = 49;break;}
        displayMessage(message, message);
    
}

    public static void main(String[] args) {
        showBug();
    }
}