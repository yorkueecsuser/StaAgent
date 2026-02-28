import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        return list;
    }
    
    // Mutant code with Renaming mutation operator applied
    public List<Integer> showBugMutant() {
        // This line demonstrates the bug
        List<Integer> l = Collections.nCopies('a', 10); // Renamed 'list' to 'l'
        return l;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
        
        // Testing the mutant method
        List<Integer> mutantResult = example.showBugMutant();
        System.out.println("Size of mutant list: " + mutantResult.size());
        System.out.println("First element in mutant list: " + mutantResult.get(0));
    }
}