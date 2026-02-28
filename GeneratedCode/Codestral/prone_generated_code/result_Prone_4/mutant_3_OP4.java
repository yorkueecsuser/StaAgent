// Java code that demonstrates ArrayHashCode bug with Unreachable if-else statement mutant
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable block
            System.out.println("This line should never be executed.");
        } else {
            // Original code
            return array.hashCode(); // BUG: ArrayHashCode
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}