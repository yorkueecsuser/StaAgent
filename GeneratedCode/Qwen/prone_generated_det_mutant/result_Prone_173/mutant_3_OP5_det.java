import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceExample {

    // Method demonstrating the bug
    public Collection<String> showBug(Collection<String> foos) {
        int pasmmrco = 0;switch  (pasmmrco) {case 1:long otoljuvy = -726089077;break;default:byte meafjnxa = -29;break;}
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