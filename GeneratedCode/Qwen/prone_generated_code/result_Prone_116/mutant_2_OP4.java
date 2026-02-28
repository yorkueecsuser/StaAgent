import java.util.Collections;
import java.util.List;

class NCopiesOfCharExample {

    // Method to demonstrate the bug
    public List<Integer> showBug(int numberOfCopies, char character) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) character, numberOfCopies);

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            System.out.println("This is an unreachable block");
        } else {
            // This block also should never execute
            System.out.println("This is another unreachable block");
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true in testing scenarios
    }

    public static void main(String[] args) {
        NCopiesOfCharExample example = new NCopiesOfCharExample();
        List<Integer> result = example.showBug(10, 'a');
        System.out.println(result); // This will print a list with 97 copies of 10
    }
}