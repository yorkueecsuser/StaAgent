class MutableArrayExample {

    // This is a mutable array that is public and static
    public static final int[] numbers = {1, 2, 3, 4, 5}; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void showBug() {
        // Modifying the array contents from a different method
        numbers[0] = 99;  // This demonstrates how the array can be altered
    }

    public static int[] getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Original array:");
        for (int number : getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Demonstrating the bug by calling showBug
        showBug();

        System.out.println("Modified array:");
        for (int number : getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

// Mutated version with a variable renamed
class MutableArrayExample_Mutant {

    // This is a mutable array that is public and static
    public static final int[] numbers = {1, 2, 3, 4, 5}; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void g() { // Renamed from showBug to g
        // Modifying the array contents from a different method
        numbers[0] = 99;  // This demonstrates how the array can be altered
    }

    public static int[] f() { // Renamed from getNumbers to f
        return numbers;
    }

    public static void main(String[] r) { // Renamed from args to r
        System.out.println("Original array:");
        for (int n : f()) { // Renamed from getNumbers to f
            System.out.print(n + " "); // Renamed from number to n
        }
        System.out.println();

        // Demonstrating the bug by calling showBug
        g(); // Renamed from showBug to g

        System.out.println("Modified array:");
        for (int n : f()) { // Renamed from getNumbers to f
            System.out.print(n + " "); // Renamed from number to n
        }
        System.out.println();
    }
}