import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        return list;
    }

    // Mutant generated for variable renaming
    public List<Integer> showBug_mutant() {
        // This line demonstrates the bug
        List<Integer> l = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        return l;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));

        // Mutant code execution
        List<Integer> result_mutant = example.showBug_mutant();
        System.out.println("Size of list (mutant): " + result_mutant.size());
        System.out.println("First element in list (mutant): " + result_mutant.get(0));
    }
}