import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }

    private boolean getCondition() {
        // Simulate a condition that is always false
        return System.currentTimeMillis() < 0;  // This will never be true
    }

    private void unreachableIfElseExample() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }
    }
    
    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);

        // Demonstrates the unreachable if-else
        checker.unreachableIfElseExample();
    }
}