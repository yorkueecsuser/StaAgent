import java.util.HashSet;
import java.util.Set;

class CollectionBugExample {

    public void showBug() {
        Set<Set<Integer>> set = new HashSet<>();
        boolean zcnfbhas = false;while (zcnfbhas && false && true && true && false && false && true && true && false && false && false && false) {double ipimsnxt = -634365494;}
        set.add((Set<Integer>) (Set<?>) set); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(set.hashCode()); // This line will cause StackOverflowError
    
}

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        example.showBug();
    }
}