import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException

        boolean condition = getCondition();
        if (condition) {
            switch (0) {
                case 0:
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }

    public boolean getCondition() {
        // This method is used to ensure that the condition of the switch statement is dynamically determined at runtime
        return false;
    }
}