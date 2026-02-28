class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Inserting an unreachable if statement
        boolean condition = false; // This is a runtime-determined condition
        if (condition) {
            System.out.println("This is an unreachable code block in showBug method.");
        }
        
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Inserting an unreachable if statement
        boolean condition = false; // This is a runtime-determined condition
        if (condition) {
            System.out.println("This is an unreachable code block in showBugWithStringBuffer method.");
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}