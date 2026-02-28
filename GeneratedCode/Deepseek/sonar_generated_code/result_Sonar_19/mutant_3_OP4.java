class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException

        // Mutant Code 1: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            return arr[3]; // the original line of code
        } else {
            return 0; // unreachable code
        }
    }
}