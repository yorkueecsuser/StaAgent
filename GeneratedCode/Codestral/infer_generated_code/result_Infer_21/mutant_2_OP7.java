class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable while loop mutant
            System.out.println("This is an unreachable part of the code");
        }
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}