class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Inserting an unreachable if-else statement
        boolean condition = getCondition(); // A non-final variable to ensure runtime evaluation
        if (condition) {
            System.out.println("This should never print.");
        } else {
            System.out.println("This is the else part of the unreachable if-else branch.");
        }

        return result;
    }

    // A method to ensure the condition is evaluated at runtime
    private boolean getCondition() {
        return false; // Always returns false to make the if-else branch unreachable
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}