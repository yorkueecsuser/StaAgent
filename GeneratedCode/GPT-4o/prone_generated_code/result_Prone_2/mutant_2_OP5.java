import java.util.Objects;

class ArrayEqualityChecker {

    public boolean showBug(int[] array1, int[] array2) {
        // This line contains the bug, we are comparing arrays using Objects.equals()
        return Objects.equals(array1, array2); // BUG: ArrayEquals
    }
    
    private int getSwitchValue() {
        // This method returns a value that ensures the switch statement remains unreachable
        return -1;
    }

    public static void main(String[] args) {
        ArrayEqualityChecker checker = new ArrayEqualityChecker();
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // Demonstrates the bug
        boolean result = checker.showBug(array1, array2);
        System.out.println("Are arrays equal? " + result);
        
        // Unreachable switch statement
        int value = checker.getSwitchValue();
        switch (value) {
            case 1:
                System.out.println("This is never reached.");
                break;
            case 2:
                System.out.println("This is also never reached.");
                break;
            default:
                // Intentionally left empty to ensure the default case does not execute any code
                break;
        }
    }
}