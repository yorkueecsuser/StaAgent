import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, but it is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Introduce an unreachable if-else statement
        boolean condition = checker.getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else.");
        }

        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
    }
}