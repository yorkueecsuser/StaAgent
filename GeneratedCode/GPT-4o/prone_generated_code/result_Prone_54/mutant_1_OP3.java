class FormatStringBugExample {

    private boolean getUnreachableCondition() {
        return false; // This method returns a condition that makes the branch unreachable
    }

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        
        // Unreachable if statement using a method call to avoid compile-time constant errors
        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable and should not be executed.");
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}