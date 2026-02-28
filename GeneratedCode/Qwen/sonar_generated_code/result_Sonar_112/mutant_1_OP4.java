class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;

            // Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                result += 10; // This part of the code is unreachable due to the logic of getCondition()
            } else {
                result -= 5;  // This part of the code is also unreachable due to the logic of getCondition()
            }
        }
        return result;
    }

    // Method to provide a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}