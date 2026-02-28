class StringBuilderInitWithCharBug {

    private boolean getFalseCondition() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar

        // Inserting unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable, so it can contain any code, such as a System.out.println statement
            System.out.println("This code will never execute.");
        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}