class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;

            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because shouldRun is always false
                result *= 2;
            } else {
                // This block will always execute
                result += 1;
            }
        }
        return result;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}