import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    private boolean getFalseCondition() {
        return false;
    }

    public Collection<Integer> showBug(Collection<Integer> collection) {
        if (getFalseCondition()) {
            collection.addAll(collection); // Unreachable code
        } else {
            collection.addAll(collection); // Original code
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}