class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        
        // Insert an unreachable while loop
        boolean conditionWhile = getCondition(); // Using a method to ensure it's not a compile-time constant
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        }

        return result;
    }
    
    // Method to simulate obtaining a condition at runtime
    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}