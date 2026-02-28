class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Loop will never be executed
        }
        
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Loop will never be executed
        }
        
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        return sb.toString();
    }

    private boolean getCondition() {
        return false; // This makes the for loop condition false at runtime
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}