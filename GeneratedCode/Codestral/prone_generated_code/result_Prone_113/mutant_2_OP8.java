import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        Collection<Integer> c = collection; // Mutation: Renamed variable collection to c
        c.addAll(c);
        return c;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}