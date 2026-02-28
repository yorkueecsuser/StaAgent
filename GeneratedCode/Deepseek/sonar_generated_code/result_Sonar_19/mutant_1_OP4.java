class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        if (false) { // Unreachable if-else statement mutation
            return 0;
        } else {
            return arr[3]; // this line contains the bug
        }
    }
}