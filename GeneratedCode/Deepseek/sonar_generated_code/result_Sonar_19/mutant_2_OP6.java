class ArrayBug {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        showBug(arr);
    }

    public static int showBug(int[] arr) {
        // Mutation Operator: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code for loop
            System.out.println("Unreachable code for loop");
        }
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[3]; // this line contains the bug
    }

    private static boolean getCondition() {
        return false; // Mutation
    }
}