class StringToStringBug {
    private String baz(String input) {
        // BUG: StringToString
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if-else statement
            System.out.println("This is an unreachable statement");
        }
        return input.toString();
    }

    public String showBug(String input) {
        return baz(input);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }

    private boolean getCondition() {
        // This method is just for demonstration and should be replaced with a meaningful condition.
        return false;
    }
}