import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        
        // Duplication mutation: Duplicate the assignment statement
        int originalHashCode = demo.showBug(intArray);
        int duplicatedHashCode = demo.showBug(intArray); // Duplicate line
        System.out.println("HashCode of intArray: " + originalHashCode);

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));
    }
}