class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        int i = 0;
        char[] chars = input.toCharArray();
        if (chars.length > 0) {
            do {
                Character c = chars[i]; // Original loop body remains
                i++;
            } while (i < chars.length); // Equivalent do-while loop added
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}