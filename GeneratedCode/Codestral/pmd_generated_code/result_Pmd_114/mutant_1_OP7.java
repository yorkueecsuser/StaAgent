class StringToStringBug {
    private String baz(String input) {
        // Added unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }

        // BUG: StringToString
        return input.toString();
    }

    private boolean getCondition() {
        // Simulating a condition that is always false
        return false;
    }

    public String showBug(String input) {
        return baz(input);
    }

    public static void main(String[] args) {
        StringToStringBug bug = new StringToStringBug();
        String result = bug.showBug("howdy");
        System.out.println(result);
    }
}