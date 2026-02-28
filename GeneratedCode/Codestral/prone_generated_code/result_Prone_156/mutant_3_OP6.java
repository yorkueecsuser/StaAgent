class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar

        // Mutant: Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("Unreachable loop");
        }

        return sb;
    }

    // Helper method to get the condition for the loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}