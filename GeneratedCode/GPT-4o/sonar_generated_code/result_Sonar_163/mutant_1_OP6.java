class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Unreachable for loop
        boolean conditionFor = getCondition(); // dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
        
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Unreachable for loop
        boolean conditionFor = getCondition(); // dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
        
        return sb.toString();
    }

    private boolean getCondition() {
        return false; // Dynamic determination at runtime
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}