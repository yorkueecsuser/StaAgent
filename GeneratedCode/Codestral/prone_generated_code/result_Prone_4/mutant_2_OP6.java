// Java code that demonstrates ArrayHashCode bug with an unreachable for loop mutation
class ArrayHashCodeBug {

    // Method that always returns false to make the loop unreachable
    public boolean getCondition() {
        return false;
    }

    public int showBug(int[] array) {
        // Inserted unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}