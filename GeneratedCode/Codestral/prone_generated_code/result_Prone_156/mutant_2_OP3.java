class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        if (getCondition()) { // Mutant: Unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return sb;
    }

    // This method simulates a runtime condition that always returns false for the mutant if statement.
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}