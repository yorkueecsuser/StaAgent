class CheckReturnValueBug {

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }

        input.concat("\n"); // BUG: CheckReturnValue
        input.concat("\n"); // BUG: CheckReturnValue
        return input;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello");
        System.out.println(result);
    }
}