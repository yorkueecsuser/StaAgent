import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
        
        // Unreachable switch statement mutant
        int switchValue = getUnreachableSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("This is case 1.");
                break;
            case 2:
                System.out.println("This is case 2.");
                break;
            // No default case to ensure the switch is unreachable
        }
    }

    // Method to ensure the switch statement uses a non-final variable
    private static int getUnreachableSwitchValue() {
        return 0; // Always returns 0, ensuring the switch cases are unreachable
    }
}