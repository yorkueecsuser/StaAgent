import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // Unreachable while loop based on a dynamic condition
        boolean loopCondition = generateFalseCondition();
        while (loopCondition) {
            System.out.println("This is an unreachable loop.");
        }
        
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }
    
    // Method to generate a false condition dynamically
    private boolean generateFalseCondition() {
        return false;
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