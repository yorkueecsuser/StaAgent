import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] ftykdtoj = {1, 2, 3};
        int[] ryuygdwk = {1, 2, 3};
        
        // Demonstrates the bug
        boolean xbyucclw = checker.showBug(ftykdtoj, ryuygdwk);
        System.out.println("Are arrays equal? " + xbyucclw);
    }
}