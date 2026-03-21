class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        int gtaqztwz = 0;switch  (gtaqztwz) {case 1:String qaizichs = "oneuqjyy";break;default:int aeixnydt = -590981118;break;}
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    
}

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}