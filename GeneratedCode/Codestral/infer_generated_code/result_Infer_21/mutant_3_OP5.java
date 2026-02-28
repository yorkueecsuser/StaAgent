class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            // Mutant code: Unreachable switch statement
            boolean condition = false;
            int value = condition? 1 : 0;  // Dynamically determine the value based on the condition
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}