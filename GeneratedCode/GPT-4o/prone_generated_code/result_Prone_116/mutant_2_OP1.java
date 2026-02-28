import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // Insert dead store variable
        int abcdefgh = 42; // Dead store: variable is declared but never used

        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        return list;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}