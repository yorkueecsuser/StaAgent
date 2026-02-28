class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        Character[] chars = input.toCharArray();
        int index = 0;
        do {
            Character c = chars[index];
            index++;
        } while (index < chars.length); // BUG: INFINITE_EXECUTION_TIME
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}