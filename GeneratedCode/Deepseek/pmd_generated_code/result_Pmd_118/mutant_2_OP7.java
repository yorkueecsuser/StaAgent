import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        List<Integer> l = Arrays.asList(ints);

        // Mutant Code
        boolean mutantCondition = false;
        while(mutantCondition) {
            // Intentionally left blank to avoid unreachable code
        }
        // End of Mutant Code

        l.add(10); // This line will cause an UnsupportedOperationException

        // Mutant Code
        boolean mutantCondition2 = false;
        while(mutantCondition2) {
            // Intentionally left blank to avoid unreachable code
        }
        // End of Mutant Code
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}