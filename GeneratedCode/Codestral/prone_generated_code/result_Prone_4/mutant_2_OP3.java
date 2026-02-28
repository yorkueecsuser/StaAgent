// Java code that demonstrates ArrayHashCode bug with Unreachable if statement mutation
class ArrayHashCodeBug {

    public int showBug(int[] array) {
        if(isUnreachable()) {
            // Unreachable code added according to the mutation operator
            System.out.println("This line is unreachable");
        }
        return array.hashCode(); // BUG: ArrayHashCode
    }

    private boolean isUnreachable() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println(new ArrayHashCodeBug().showBug(array1));
        System.out.println(new ArrayHashCodeBug().showBug(array2));
    }
}