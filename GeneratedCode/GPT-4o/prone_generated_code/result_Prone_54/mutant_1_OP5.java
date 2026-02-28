class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        
        // Adding an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Neither this.");
                break;
        }
        
        return result;
    }
    
    // Method to simulate a complex condition for the switch statement
    private int getUnreachableCondition() {
        // Returning a value that does not match any case statement
        return 3;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}