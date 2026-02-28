import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        boolean triggerSwitch = false;

        // Mutant: Unreachable switch statement
        if (triggerSwitch) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This case will never be reached as the condition is always false
                    collection.addAll(collection);
                    break;
            }
        }

        collection.addAll(collection);
        return collection;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}