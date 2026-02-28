import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {
    
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        try {
            immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }

        // Adding a mutation: an unreachable if-else statement
        int randomValue = (int) (Math.random() * 10); // Generate a random number between 0 and 9
        if (randomValue > 10) { // This condition is always false
            System.out.println("This block is never executed because randomValue is always less than or equal to 9");
        } else {
            System.out.println("This block will always execute");
        }
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}