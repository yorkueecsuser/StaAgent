class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Mutant: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line is never executed.");
        }

        return result;
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return System.currentTimeMillis() < 0; // Always false at runtime
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}