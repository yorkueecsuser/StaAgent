import java.util.Objects;

class ReversedArgumentsBug {

    public static void displayMessage(String msg, Object obj) {
        Objects.requireNonNull(msg, "Message cannot be null");
        System.out.println(msg + ": " + obj);
    }
public static void showBug() {
    String message = "Hello, World!";
    message = "Hello, World!";
    displayMessage(message , message);
}

    public static void main(String[] args) {
        showBug();
    }
}