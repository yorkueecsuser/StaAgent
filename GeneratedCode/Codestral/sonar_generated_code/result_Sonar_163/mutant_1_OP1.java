import java.util.Random;

class StringBuilderBug {
    public String showBug() {
        StringBuilder sb = new StringBuilder('A');
        int deadStore; // Dead Store: Unused variable declaration
        deadStore = new Random().nextInt(); // Assign a random value to the dead store
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBug bugInstance = new StringBuilderBug();
        System.out.println(bugInstance.showBug());
    }
}