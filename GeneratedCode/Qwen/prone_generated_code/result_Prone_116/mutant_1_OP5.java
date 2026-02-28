import java.util.Collections;
import java.util.List;

class NCopiesOfCharExample {

    // Method to demonstrate the bug
    public List<Integer> showBug(int numberOfCopies, char character) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) character, numberOfCopies);

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case.");
                break;
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined
    }

    public static void main(String[] args) {
        NCopiesOfCharExample example = new NCopiesOfCharExample();
        List<Integer> result = example.showBug(10, 'a');
        System.out.println(result); // This will print a list with 97 copies of 10
    }
}