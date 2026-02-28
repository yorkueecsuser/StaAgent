class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        // Unreachable switch statement based on dynamic condition
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 99999: // This case should never be reached
                System.out.println("This statement is unreachable");
                break;
            default:
                break;
        }

        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        // Unreachable switch statement based on dynamic condition
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 88888: // This case should never be reached
                System.out.println("This statement is unreachable");
                break;
            default:
                break;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }

    // Method to return a value that ensures the switch statement cases are unreachable
    private int getUnreachableValue() {
        return -1; // Always returns a value that is not matched in the switch cases
    }
}