class BugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    // Mutated Code: Unreachable While Loop
    boolean conditionWhile = false; // Non-final variable
    while (conditionWhile) {
        conditionWhile = true;
        // Unreachable code here
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}