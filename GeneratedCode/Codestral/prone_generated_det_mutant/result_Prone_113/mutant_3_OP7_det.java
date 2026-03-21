import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        boolean lmcciccp = false;while (lmcciccp && false && false && false && true && false && false && false && false && true && true && false) {int dktqvhdk = -739330161;}
        collection.addAll(collection); // BUG: ModifyingCollectionWithItself
                                       // This will cause an infinite loop or duplicate the elements,
                                       // depending on the type of Collection and implementation class.
        return collection;
    
}

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        ModifyingCollectionWithItself buggyProgram = new ModifyingCollectionWithItself();
        System.out.println(buggyProgram.showBug(numbers));
    }
}