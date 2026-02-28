class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                result -= i; // This line will never be executed
            }
        }
        return result;
    }

    // Method to provide a dynamic condition for the if statement
    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}