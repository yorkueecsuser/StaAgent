import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos));

        // Mutated code
        int value = 0;
        boolean condition = getFalseCondition();
        if (condition) {
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code is unreachable!");
                    break;
            }
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