import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos));
        boolean condition = getCondition(); // added this line
        if (condition) { // added this condition
            int unreachableValue = 0; // this value will never be 1 as per getCondition()
            switch(unreachableValue) {
                case 1:
                    // unreachable code
                    break;
            }
        }
        return foos;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the switch statement unreachable
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