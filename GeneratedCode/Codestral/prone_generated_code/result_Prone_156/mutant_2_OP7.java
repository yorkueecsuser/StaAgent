class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("Unreachable code executed.");
        }
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        return sb;
    }

    private boolean getCondition() {
        return false;  // Always return false
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}