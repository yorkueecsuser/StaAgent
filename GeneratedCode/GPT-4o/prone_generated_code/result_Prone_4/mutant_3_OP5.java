import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));

        // Mutation Operator: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Non-final variable to avoid compile-time constant issue
        switch(unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            // No default case to ensure it's structurally reachable
        }
    }

    // Helper method to provide a non-final value
    private static int getUnreachableValue() {
        return 0; // This makes the switch statement unreachable, but condition is a runtime decision
    }
}