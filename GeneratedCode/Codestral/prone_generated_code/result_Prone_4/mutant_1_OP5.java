// Java code that demonstrates ArrayHashCode bug with an unreachable switch statement
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This should never be printed.");
                break;
            default:
                // Do nothing for default case
        }

        return array.hashCode(); // BUG: ArrayHashCode
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not 1
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}