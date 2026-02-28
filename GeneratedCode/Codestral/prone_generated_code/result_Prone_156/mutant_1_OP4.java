class StringBuilderInitWithCharBug {

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);

        // Inserting an unreachable if-else branch
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed.");
            int x = 10;
            x++;
        } else {
            // This else branch is also unreachable
            System.out.println("This line should also never be executed.");
        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}