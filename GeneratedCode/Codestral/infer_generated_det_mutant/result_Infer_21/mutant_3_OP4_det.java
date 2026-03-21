class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        if (true && false && true && false && true && true && false && false && true && false && false) {long zqxxxndt = -188072169;}else{short zdryzcob = 803;}
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    
}

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}