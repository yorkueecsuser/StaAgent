// Java code that demonstrates ArrayHashCode bug with Unreachable while loop mutant
class ArrayHashCodeBug {

    private boolean getCondition() {
        return false; // always return false to make the loop unreachable
    }

    public int showBug(int[] array) {
        // Inserting unreachable while loop
        while (getCondition()) {
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