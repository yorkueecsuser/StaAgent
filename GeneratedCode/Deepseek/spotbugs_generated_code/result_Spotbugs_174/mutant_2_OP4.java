class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        // Insert unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            int[] copyOfNumbers = new int[numbers.length];
            System.arraycopy(numbers, 0, copyOfNumbers, 0, numbers.length);
            return copyOfNumbers;
        } else {
            return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        }
    }

    // The remaining code remains unchanged

    //...
}