// Java code that demonstrates ArrayHashCode bug with Unreachable if-else statement mutation
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        boolean neverTrue = getCondition();
        if (neverTrue) {
            // Unreachable code
            System.out.println("This line should never be executed!");
        } else {
            // Normal operation
            return array.hashCode();
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if-statement unreachable
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}