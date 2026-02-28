import java.util.Random;

class NullPointerDereference {
    private String message;

    public void showBug() {
        Random rand = new Random();
        int unusedVar = rand.nextInt(100); // Adding a dead store
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }
}