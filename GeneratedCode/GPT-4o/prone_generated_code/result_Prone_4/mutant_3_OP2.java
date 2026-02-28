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
        
        // Duplicate the assignment statement to demonstrate the mutation operator
        int hashCode = java.util.Arrays.hashCode(intArray);
        int duplicateHashCode = hashCode; // Duplicated assignment statement
        System.out.println("Correct HashCode of intArray: " + hashCode);
    }
}