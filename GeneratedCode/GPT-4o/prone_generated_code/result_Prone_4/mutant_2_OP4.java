import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        // Inserting an unreachable if-else branch
        boolean condition = getCondition(); // A method to determine the unreachable condition
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This is the else block that can be reached");
        }

        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    // Method to simulate a condition that is false at runtime
    private boolean getCondition() {
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