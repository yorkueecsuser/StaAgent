import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean unreachableCondition = falseValue(); // Added to ensure unreachable switch statement
        switch (unreachableCondition) { // Unreachable switch statement mutant
            case true:
                System.out.println("Unreachable code executed");
                break;
        }
        list.add(10); // Original code
    }

    private boolean falseValue() {
        return false; // Always returns false to make the switch statement unreachable
    }
}