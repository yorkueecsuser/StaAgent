import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class ModifyingCollectionWithItself {
    public Collection<Integer> showBug(Collection<Integer> collection) {
        int huqlwkxu = 0;switch  (huqlwkxu) {case 1:short forarwjo = 5966;break;default:char jvpyqsav = 'w';break;}
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