class ConsecutiveLiteralAppendsBug {

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello").append(" ").append("World"); // BUG: ConsecutiveLiteralAppends

        // Mutant: Unreachable if-else statement
        if (isUnreachable()) {
            // This block will never execute
            System.out.println("This is an unreachable block");
        } else {
            // Original code remains unchanged
        }

        return buf.toString();
    }

    private boolean isUnreachable() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        System.out.println(bugDemo.showBug());
    }
}