class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            System.out.println("This block is unreachable due to the condition being false.");
        }

        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");

        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            System.out.println("This block is unreachable due to the condition being false.");
        }

        return sb.toString();
    }

    private boolean getCondition() {
        // Returns false to ensure the added if statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}