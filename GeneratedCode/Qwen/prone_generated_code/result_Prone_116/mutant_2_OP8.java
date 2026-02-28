import java.util.Collections;
import java.util.List;

class NCopiesOfCharExample {

    // Method to demonstrate the bug
    public List<Integer> showBug(int numberOfCopies, char character) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) character, numberOfCopies);
    }

    // Mutated method with renamed variable
    public List<Integer> showBug(int x, char y) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) y, x);
    }

    public static void main(String[] args) {
        NCopiesOfCharExample example = new NCopiesOfCharExample();
        List<Integer> result = example.showBug(10, 'a');
        System.out.println(result); // This will print a list with 97 copies of 10

        // Testing mutated method
        List<Integer> mutatedResult = example.showBug(10, 'a');
        System.out.println(mutatedResult); // This will also print a list with 97 copies of 10
    }
}