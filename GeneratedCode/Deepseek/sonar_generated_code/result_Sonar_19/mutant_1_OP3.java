class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        boolean shouldRun = getCondition(); 
        if (shouldRun) {
            return arr[3]; // this line contains the bug
        }

        return 0; // this line is added to avoid unreachable statement error
    }

    // This method is added to avoid using compile-time constants in conditions
    public static boolean getCondition() {
        return false;
    }
}