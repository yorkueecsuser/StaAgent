import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        boolean unreachableCondition = false;
        int value = getValue(); // This method should return a non-zero value to avoid the unreachable statement error.
        switch(value) {
            case 1:
                if(unreachableCondition) { // This condition always evaluates to false to make the switch statement unreachable.
                    System.out.println("This print statement should never execute.");
                }
                break;
        }
        return foos;
    }

    private int getValue() {
        return 2; // Return a non-zero value to make the switch statement unreachable.
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