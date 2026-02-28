import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace

        // Mutated code: adding unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code should never execute");
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