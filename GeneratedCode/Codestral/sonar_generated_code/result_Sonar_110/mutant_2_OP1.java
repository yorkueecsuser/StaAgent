import java.util.Random;

class NullPointerDereference {
    private String message;
    private String deadStore; // Dead store variable

    public void showBug() {
        Random random = new Random();
        deadStore = "abcdefgh"; // Initializing the dead store variable with a random string
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }
}