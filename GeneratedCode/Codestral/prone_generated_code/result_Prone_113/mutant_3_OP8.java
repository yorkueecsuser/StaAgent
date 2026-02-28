import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        Collection<Integer> c = collection; // new variable 'c' is introduced
        c.addAll(c); // BUG: ModifyingCollectionWithItself
                     // This will cause an infinite loop or duplicate the elements,
                     // depending on the type of Collection and implementation class.
        return c;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}