class StringBuilderBugExample {

    // Method to demonstrate the bug
    public String showBug(char c) {
        // BUG: StringBuilderInitWithChar
        StringBuilder sb = new StringBuilder(c); // This line initializes the StringBuilder with the int value of the char, not the char itself
        sb.append("Hello");

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            sb.append("Unreachable");
        } else {
            // This block should also never execute
            sb.append("AlsoUnreachable");
        }

        return sb.toString();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if-else branches are unreachable
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A')); // Expected to print "AHello", but prints "Hello" with capacity 65
    }
}