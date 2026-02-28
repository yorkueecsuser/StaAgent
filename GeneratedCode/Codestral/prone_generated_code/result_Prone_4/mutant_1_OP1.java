// Java code that demonstrates ArrayHashCode bug with a dead store mutant
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        int deadStoreVar; // Added dead store mutant
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}