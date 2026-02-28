class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Unreachable while loop mutation
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        }

        return result;
    }
    
    // Method to provide a false condition
    private boolean getFalseCondition() {
        return false; // Non-final method to ensure dynamic check
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}