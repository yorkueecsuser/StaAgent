class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("This is an unreachable code block.");
        }

        return result;
    }

    // A method to simulate a condition that returns false
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}