class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        // The unreachable for loop is inserted here
        for (int i = 0; i < 0; i++) {
            System.out.println("This loop is unreachable");
        }

        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[3]; // this line contains the bug
    }
}