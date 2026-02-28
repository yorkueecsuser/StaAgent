import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        // Mutation: Insert an unreachable while loop
        boolean unreachableCondition = isConditionFalse();
        while (unreachableCondition) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        }
        
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    // Helper method to ensure the condition is false at runtime
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));
    }
}