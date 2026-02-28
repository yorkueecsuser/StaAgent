import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // Adding an unreachable if statement as a mutant
        boolean condition = generateCondition(); // Method to provide a condition dynamically
        if (condition) {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable block");
        }
        
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }
    
    // Method to ensure we get a dynamically evaluated condition
    private boolean generateCondition() {
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