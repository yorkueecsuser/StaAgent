class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Unreachable while loop as a mutant
        boolean conditionWhile = getCondition(); // This should always return false
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This should never print - showBug method.");
        }

        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        // Unreachable while loop as a mutant
        boolean conditionWhile = getCondition(); // This should always return false
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This should never print - showBugWithStringBuffer method.");
        }

        return sb.toString();
    }

    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}