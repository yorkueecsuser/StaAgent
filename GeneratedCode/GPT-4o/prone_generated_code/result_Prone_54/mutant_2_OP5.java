class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        
        // Unreachable switch statement with a condition that will always evaluate to false
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This will never be printed either.");
                break;
        }

        return result;
    }
    
    // Method to provide a condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return -1; // Always returning a value not matched in the switch cases
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}