// Java code that demonstrates ArrayHashCode bug
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        array1 = array2; // Duplicated assignment statement

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}