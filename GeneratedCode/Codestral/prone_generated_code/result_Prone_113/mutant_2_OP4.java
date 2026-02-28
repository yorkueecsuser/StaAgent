import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself

        // Mutant: Unreachable if-else statement
        Random rand = new Random();
        if (rand.nextInt(1000) == 0) { // This condition is highly unlikely to be true
            collection.clear(); // Unreachable code that clears the collection
        } else {
            // Do nothing in the else branch
        }

        return collection;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}