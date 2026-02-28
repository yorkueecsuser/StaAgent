import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        boolean conditionFor = getCondition(); // Always returns false to make the loop unreachable
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This is an unreachable for loop");
        }
        return foos;
    }

    public boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
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