class BugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    // Mutation: Unreachable if-else statement
    public boolean getCondition() {
        return false;
    }

    public String showBugMutant(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            // Mutation: Unreachable if-else statement
            if (getCondition()) {
                return "Mutant: Input is: " + input;
            }
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
        System.out.println(bugExample.showBugMutant(null)); // Testing the mutant
    }
}