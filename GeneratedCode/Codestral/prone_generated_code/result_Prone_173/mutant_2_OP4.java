import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos));
        if (getUnreachableCondition()) {
            // Unreachable if-else statement mutant
            System.out.println("This line should never be reached.");
        } else {
            System.out.println("This line is always reached.");
        }
        return foos;
    }

    public void showBug() {
        Collection<String> input = Arrays.asList("apple", "banana", "cherry");
        Collection<String> result = sort(input);
        System.out.println("Original collection: " + input);
        System.out.println("Returned collection: " + result);
    }

    public static void main(String[] args) {
        UnusedCollectionModifiedInPlaceBug bug = new UnusedCollectionModifiedInPlaceBug();
        bug.showBug();
    }
}