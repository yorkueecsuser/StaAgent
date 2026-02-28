class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        int result = 0;
        int i = 3;
        switch(i) {
            case 1:
                result = arr[1];
                break;
            case 2:
                result = arr[2];
                break;
            default: // Unreachable switch statement
                throw new AssertionError();
        }
        return result;
    }
}