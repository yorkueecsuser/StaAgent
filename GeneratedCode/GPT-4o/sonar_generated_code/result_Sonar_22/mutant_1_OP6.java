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

        // Mutation: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This block is unreachable due to condition being false
            System.out.println("This is an unreachable for loop");
        }
    }

    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}