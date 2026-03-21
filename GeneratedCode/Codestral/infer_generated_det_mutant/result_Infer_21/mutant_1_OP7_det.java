class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        boolean efjnaoyd = false;while (efjnaoyd && true && false && true && true && false && true && false && false && true && true && false) {float mctepeew = -812350095;}
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    
}

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}