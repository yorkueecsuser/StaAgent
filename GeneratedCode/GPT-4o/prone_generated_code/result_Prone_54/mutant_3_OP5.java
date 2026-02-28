class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        
        // Inserting unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code block");
                break;
            default:
                // Default case also unreachable
                System.out.println("Default unreachable block");
                break;
        }
        
        return result;
    }
    
    private int getUnreachableCondition() {
        // This method returns a value that ensures the switch statement is unreachable
        return -1;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}