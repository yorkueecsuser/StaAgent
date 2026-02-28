class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;

            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    result -= i;
                    break;
                case 1:
                    // This case will always be executed
                    result += i;
                    break;
            }
        }
        return result;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}