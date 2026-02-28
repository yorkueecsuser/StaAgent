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
    }
}

// Mutant Code: Renaming a user-defined variable
class ArrayHashCodeDemoMutant {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] b) { // 'arr' renamed to 'b'
        return Objects.hashCode(b); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemoMutant d = new ArrayHashCodeDemoMutant(); // 'demo' renamed to 'd'
        int[] i = {1, 2, 3}; // 'intArray' renamed to 'i'
        System.out.println("HashCode of intArray: " + d.showBug(i));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(i));
    }
}