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
    }
}

class MutatedBugExample {
    public String showBug(String input) {
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            while (false) {
                System.out.println("This is an unreachable while loop");
            }
            return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        MutatedBugExample bugExample = new MutatedBugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}