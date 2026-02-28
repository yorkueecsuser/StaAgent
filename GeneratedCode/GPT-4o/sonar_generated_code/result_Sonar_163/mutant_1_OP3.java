class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Introducing an unreachable if statement
        boolean condition = getFalseCondition(); // Ensures condition is checked at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        }
        
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Introducing an unreachable if statement
        boolean condition = getFalseCondition(); // Ensures condition is checked at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        }

        return sb.toString();
    }
    
    // Method to ensure the condition evaluates to false at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}