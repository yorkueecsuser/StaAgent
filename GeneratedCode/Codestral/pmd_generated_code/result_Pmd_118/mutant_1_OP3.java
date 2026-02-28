import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            // Unreachable if statement - this branch is always skipped
            System.out.println("This is an unreachable branch");
        }
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }

    private boolean falseMethod() {
        return false;
    }
}