class CheckReturnValueBug {

    public String showBug(String input) {
        input.concat("\n"); // BUG: CheckReturnValue
        input.concat("\n"); // BUG: CheckReturnValue

        // Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            input = input + " This is unreachable";
        }

        return input;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);
    }
}