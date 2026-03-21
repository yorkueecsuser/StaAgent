import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] bedeteyx = {1, 2, 3};
        int[] ayivsugp = {1, 2, 3};
        
        // Demonstrates the bug
        boolean fxodfimh = checker.showBug(bedeteyx, ayivsugp);
        System.out.println("Are arrays equal? " + fxodfimh);
    }
}