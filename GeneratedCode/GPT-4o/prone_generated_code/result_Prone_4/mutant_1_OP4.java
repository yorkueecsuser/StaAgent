import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        boolean condition = getCondition(); // Non-final variable to ensure condition is not a compile-time constant
        if (condition) {
            System.out.println("This block is unreachable due to condition always being false.");
        } else {
            System.out.println("This is the reachable else block.");
        }
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    // Helper method to provide a non-constant condition
    private boolean getCondition() {
        return false; // Ensures the if block is never executed
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));
    }
}