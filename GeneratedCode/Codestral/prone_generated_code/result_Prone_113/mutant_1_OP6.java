import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself

        // Mutation Operator: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }

        return collection;
    }

    // Method to return a boolean condition at runtime
    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}