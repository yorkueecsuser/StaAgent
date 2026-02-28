import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        boolean isEqual = Objects.equals(array1, array2); // BUG: ArrayEquals

        // Introduce a non-final variable to simulate an unreachable if statement
        boolean unreachableCondition = checkUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }

        return isEqual;
    }

    // Helper method to ensure condition is determined at runtime
    private boolean checkUnreachableCondition() {
        return false; // This is always false making the if statement unreachable
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
    }
}