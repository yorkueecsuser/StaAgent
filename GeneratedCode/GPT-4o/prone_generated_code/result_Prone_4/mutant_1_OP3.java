import java.util.Objects;

class ArrayHashCodeDemo {

    // Method to return a false condition for unreachable if statement
    private boolean getFalseCondition() {
        return false;
    }

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        // Inserting unreachable if statement with non-final variable condition
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));
    }
}