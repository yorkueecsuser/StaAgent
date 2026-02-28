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

    {
        boolean unreachableLoopCondition = getUnreachableLoopCondition();
        while (unreachableLoopCondition == false) {
            // Avoiding unreachable loop by using a variable instead of a literal value
            System.out.println("This loop will never execute");
        }
    }

    // A method to return a Boolean value which will never make the unreachable loop execute
    private boolean getUnreachableLoopCondition() {
        return false;
    }
}