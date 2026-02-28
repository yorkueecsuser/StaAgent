class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        boolean isTrue = false;
        if (isTrue) {
            // Code that is unreachable due to the condition
            return arr[3];
        } else {
            // This code can never be executed due to the condition
            return arr[2];
        }
    }
}