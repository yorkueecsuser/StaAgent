class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Inserting unreachable if-else branch
        boolean condition = getNeverTrueCondition();
        if (condition) {
            sb.append(" Unreachable code block if");
        } else {
            sb.append(" Unreachable code block else");
        }
        
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Inserting another unreachable if-else branch
        boolean condition = getNeverTrueCondition();
        if (condition) {
            sb.append(" Unreachable code block if");
        } else {
            sb.append(" Unreachable code block else");
        }
        
        return sb.toString();
    }

    private boolean getNeverTrueCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}