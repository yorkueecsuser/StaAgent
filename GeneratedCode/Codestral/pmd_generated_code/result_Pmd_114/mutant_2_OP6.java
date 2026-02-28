class StringToStringBug {
    private boolean getFalseCondition() {
        // Method to return a false condition at runtime
        return false;
    }

    private String baz(String input) {
        // BUG: StringToString
        // Mutant: Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute because conditionFor is always false
            System.out.println("This is an unreachable loop");
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