class BugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    public String showBugMutant(String input) {
        if (false) { // Mutant: Unreachable switch statement
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
        System.out.println(bugExample.showBugMutant(null)); // Testing the mutant
    }
}