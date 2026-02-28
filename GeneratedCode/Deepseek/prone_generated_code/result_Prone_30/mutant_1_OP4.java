class BugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug

        // Mutation: Unreachable if-else statement
        // The condition `true == false` is always false so the else branch is unreachable
        if (true == false) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch can never be executed.");
        }
    }
}