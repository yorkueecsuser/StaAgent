import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        collection.addAll(collection);

        // Inserted unreachable switch statement
        int value = getFalseValue();
        switch(value) {
            case 1:
                // This code will never be reached, but we include it for the sake of a complete switch statement
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        return collection;
    }

    private int getFalseValue() {
        // This method will always return 0, ensuring the switch statement is unreachable
        return 0;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}