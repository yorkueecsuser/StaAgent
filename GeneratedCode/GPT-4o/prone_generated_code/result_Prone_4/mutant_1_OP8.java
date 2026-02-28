import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    // Mutated code with renaming
    public int showBugMutant(int[] b) {
        return Objects.hashCode(b); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));
        
        // Testing the mutated code
        System.out.println("HashCode of intArray using mutant method: " + demo.showBugMutant(intArray));
    }
}