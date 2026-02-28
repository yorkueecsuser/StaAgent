class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {} // Original code
        for (Character a : input.toCharArray()) {} // Mutated code
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}