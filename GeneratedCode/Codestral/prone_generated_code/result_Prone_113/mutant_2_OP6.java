import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    private boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable.
    }

    public Collection<Integer> showBug(Collection<Integer> collection) {
        collection.addAll(collection); // The original buggy line.

        // Added mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false.
        }

        return collection;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}