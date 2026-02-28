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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
        }
        return arr[3]; // this line contains the bug
    }

    public static boolean getCondition() {
        return false;
    }
}