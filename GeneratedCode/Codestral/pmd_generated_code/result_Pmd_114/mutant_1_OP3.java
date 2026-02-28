class StringToStringBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    private String baz(String input) {
        // BUG: StringToString
        if (getUnreachableCondition()) {
            // Mutant: Unreachable if statement
            throw new RuntimeException("This should not be executed");
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
}