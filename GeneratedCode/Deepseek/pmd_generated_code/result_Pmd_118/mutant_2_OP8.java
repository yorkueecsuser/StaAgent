import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    // Mutation: Renaming
    public void showBug(Integer[] ints, int k) {
        // BUG: UseArraysAsList
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints, 'k'); // Mutation: Renaming
    }
}