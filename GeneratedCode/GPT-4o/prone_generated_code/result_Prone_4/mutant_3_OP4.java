import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        // Unreachable if-else branch mutant
        boolean condition = getCondition(); // This condition is always false
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("The condition was false, executing else branch.");
        }
        
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    // Method to ensure condition is always false
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