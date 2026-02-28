import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
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

// Mutant code with renamed variable
class NCopiesBugExampleMutant {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> mList = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        return mList;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
        
        // Demonstrating mutant code
        NCopiesBugExampleMutant mutantExample = new NCopiesBugExampleMutant();
        List<Integer> mutantResult = mutantExample.showBug();
        System.out.println("Size of list in mutant: " + mutantResult.size());
        System.out.println("First element in mutant list: " + mutantResult.get(0));
    }
}