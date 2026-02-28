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
        // Mutation Operator Duplication
        arr[3] = 3; 
        return arr[3]; // this line contains the bug
    }
}