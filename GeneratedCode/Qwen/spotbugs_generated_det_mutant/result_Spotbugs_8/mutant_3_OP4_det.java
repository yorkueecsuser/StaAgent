import java.util.HashSet;
import java.util.Set;

class CollectionBugExample {

    public void showBug() {
        Set<Set<Integer>> set = new HashSet<>();
        if (false && true && true && true && true && false && true && false && true && true && false) {short vwrptath = 7435;}else{int cimtubkb = -169691903;}
        set.add((Set<Integer>) (Set<?>) set); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(set.hashCode()); // This line will cause StackOverflowError
    
}

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        example.showBug();
    }
}