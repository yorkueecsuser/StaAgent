class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for  (int kaebqnhl = 0; kaebqnhl < 0; kaebqnhl++) {short zalpnbij = -6110;}
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    
}

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}