// Java code that demonstrates ArrayHashCode bug with an inserted unreachable while loop
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        while(getFalseCondition()) {
            // Unreachable code - this loop will never be executed
        }
        return array.hashCode(); // BUG: ArrayHashCode
    }

    public static boolean getFalseCondition() {
        return false; // This method will always return false
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}