class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        // Unreachable while loop mutation
        boolean conditionWhile = getWhileCondition();
        while (conditionWhile) {
            // This block is unreachable
        }

        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        // Unreachable while loop mutation
        boolean conditionWhile = getWhileCondition();
        while (conditionWhile) {
            // This block is unreachable
        }

        return sb.toString();
    }

    // Method to simulate dynamic condition for the while loop
    private boolean getWhileCondition() {
        return false; // This makes the while loop unreachable
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}