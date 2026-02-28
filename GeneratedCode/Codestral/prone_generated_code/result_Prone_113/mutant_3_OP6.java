import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public boolean getCondition() {
        return false; // Returns false to make the loop unreachable
    }

    public Collection<Integer> showBug(Collection<Integer> collection) {
        boolean isConditionTrue = getCondition();
        for (int i = 0; isConditionTrue; i++) { // Unreachable for loop
            // This code block will never be executed
        }

        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
        return collection;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}