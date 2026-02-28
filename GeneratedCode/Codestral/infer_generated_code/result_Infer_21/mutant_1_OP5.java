class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    break;
            }
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }

    // Method to ensure switch case is always unreachable
    private static int getValue() {
        return 0;
    }
}