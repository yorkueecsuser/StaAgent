import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public Collection<Integer> showBug(Collection<Integer> collection) {
        if (getUnreachableCondition()) {
            // Unreachable code block
            System.out.println("This code will never be executed.");
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