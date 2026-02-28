import java.util.Collections;
import java.util.List;

class NCopiesOfCharExample {

    // Method to demonstrate the bug
    public List<Integer> showBug(int numberOfCopies, char character) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) character, numberOfCopies);
    }

    // Mutated method with renamed variable
    public List<Integer> showBugMutated(int num, char ch) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) ch, num);
    }

    public static void main(String[] args) {
        NCopiesOfCharExample example = new NCopiesOfCharExample();
        List<Integer> result = example.showBug(10, 'a');
        System.out.println(result); // This will print a list with 97 copies of 10

        // Testing mutated method
        List<Integer> mutatedResult = example.showBugMutated(10, 'a');
        System.out.println(mutatedResult); // This will print a list with 97 copies of 10
    }
}