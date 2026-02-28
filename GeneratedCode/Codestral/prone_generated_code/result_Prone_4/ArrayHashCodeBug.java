// Java code that demonstrates ArrayHashCode bug with Unreachable while loop mutant
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code: This loop will never be executed
            System.out.println("Unreachable code executed.");
        }
        return array.hashCode(); // BUG: ArrayHashCode
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}