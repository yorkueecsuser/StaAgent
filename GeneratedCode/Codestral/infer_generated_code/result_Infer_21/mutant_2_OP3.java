class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        boolean unreachableCondition = getCondition(); // a method call to determine the condition dynamically
        if (unreachableCondition) {
            System.out.println("This line will never be executed");
        }
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }

    // Dummy method to return a condition dynamically, used to avoid unreachable statement
    private static boolean getCondition() {
        return false;
    }
}