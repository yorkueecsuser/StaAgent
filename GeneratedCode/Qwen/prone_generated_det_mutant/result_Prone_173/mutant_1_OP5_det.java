import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceExample {

    // Method demonstrating the bug
    public Collection<String> showBug(Collection<String> foos) {
        int vktlqwcs = 0;switch  (vktlqwcs) {case 1:int ycrrwigc = 897167564;break;default:boolean tpyphzii = true;break;}
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    
}

    public static void main(String[] args) {
        UnusedCollectionModifiedInPlaceExample example = new UnusedCollectionModifiedInPlaceExample();
        Collection<String> input = new ArrayList<>();
        input.add("banana");
        input.add("apple");
        input.add("cherry");

        Collection<String> result = example.showBug(input);
        System.out.println("Original collection: " + input);
        System.out.println("Returned collection: " + result);
    }
}