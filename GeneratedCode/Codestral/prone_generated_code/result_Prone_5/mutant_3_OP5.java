class ArrayBug {
    public String showBug(int[] arr) {
        boolean condition = false; // Dynamically determined condition
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    break;
            }
        }
        return arr.toString(); // BUG: ArrayToString
    }

    private int getValue() {
        return 0; // Always returns a value that makes the switch statement unreachable
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bug.showBug(arr));
    }
}