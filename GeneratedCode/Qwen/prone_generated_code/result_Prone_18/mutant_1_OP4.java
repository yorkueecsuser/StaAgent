class CheckReturnValueBug {

    public String showBug(String input) {
        input.concat("\n"); // BUG: CheckReturnValue
        input.concat("\n"); // BUG: CheckReturnValue

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() returns false
            input = input + "This will not be executed";
        } else {
            // This block will always execute
            input = input + "This will be executed";
        }

        return input;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);
    }
}