class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        char[] chars = input.toCharArray();
        int i = 0;
        do {
            Character c = chars[i]; // BUG: INFINITE_EXECUTION_TIME
            i++;
        } while (i < chars.length);
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}