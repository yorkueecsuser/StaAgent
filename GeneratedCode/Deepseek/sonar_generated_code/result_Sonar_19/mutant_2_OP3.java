class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        // Mutated code
        if (false) {
            return arr[0];
        }
        return arr[3]; // this line contains the bug
    }
}