class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Adding unreachable if-else statement
        boolean condition = getFalseCondition(); // This method returns false
        if (condition) {
            sb.append(" This will never execute");
        } else {
            sb.append(" This is always executed");
        }
        
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Adding unreachable if-else statement
        boolean condition = getFalseCondition(); // This method returns false
        if (condition) {
            sb.append(" This will never execute");
        } else {
            sb.append(" This is always executed");
        }
        
        return sb.toString();
    }

    private boolean getFalseCondition() {
        return false; // This mimics an unreachable code scenario
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}