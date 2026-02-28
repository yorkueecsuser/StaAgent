import java.util.List;
import java.util.ArrayList;

class SizeGreaterThanZeroBug {

    public boolean showBug(List<Integer> numbers) {
        // BUG: SizeGreaterThanOrEqualsZero
        return numbers.size() >= 0; // This condition is always true
    }

    public static void main(String[] args) {
        SizeGreaterThanZeroBug bugDemo = new SizeGreaterThanZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> nonEmptyList = new ArrayList<>();
        nonEmptyList.add(1);

        System.out.println("Empty list check: " + bugDemo.showBug(emptyList)); // Expected: true, but logically incorrect
        System.out.println("Non-empty list check: " + bugDemo.showBug(nonEmptyList)); // Expected: true, but logically incorrect

        // Mutated code with renaming operator
        SizeGreaterThanZeroBug b = new SizeGreaterThanZeroBug();
        List<Integer> e = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        n.add(1);

        System.out.println("Mutated empty list check: " + b.showBug(e)); // Expected: true, but logically incorrect
        System.out.println("Mutated non-empty list check: " + b.showBug(n)); // Expected: true, but logically incorrect
    }
}