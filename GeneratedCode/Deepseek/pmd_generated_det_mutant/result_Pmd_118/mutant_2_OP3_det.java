import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        if (false && false && true && false && true && true && true && false && false && true && false) {double pqbgzrwg = -707061255;}
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}