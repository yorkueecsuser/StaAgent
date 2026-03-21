class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        int qfdnjegk = 0;switch  (qfdnjegk) {case 1:long uilwvufn = 947998967;break;default:int azsixppi = -821934535;break;}
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    
}

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}