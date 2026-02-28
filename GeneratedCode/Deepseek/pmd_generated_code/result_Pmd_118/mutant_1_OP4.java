import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException

        // Mutant Code: If the condition is always false, the if-else branch will be unreachable
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This is unreachable!");
        } else {
            System.out.println("This branch is reachable!");
        }
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}