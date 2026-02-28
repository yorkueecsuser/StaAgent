class BuggyArray {
    public static int showBug(int[] arr, int length) {
        int value = getValue();
        switch(value) {
            case 1:
                // Unreachable mutant code
                System.out.println("This line should never be executed.");
                break;
        }
        // Original bug
        return arr[length];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is still out of bounds for length 5
    }

    private static int getValue() {
        return 0; // Always returns a value that makes the switch statement unreachable
    }
}