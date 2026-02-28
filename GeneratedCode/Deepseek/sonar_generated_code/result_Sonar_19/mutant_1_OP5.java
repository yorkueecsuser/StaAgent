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
        int val = arr[3]; // this line contains the bug
        
        // Mutant code: Unreachable switch statement
        int unreachableVar = getUnreachableValue();
        switch (unreachableVar) {
            case 0:
                System.out.println("This code is unreachable because the switch expression is always false.");
                break;
            default:
                System.out.println("This code is unreachable because the switch expression is always false.");
                break;
        }

        return val;
    }

    // Helper method to ensure the switch expression is always false
    public static int getUnreachableValue() {
        return 0;
    }
}