class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;

            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be executed because condition is always false
                    result -= i;
                    break;
                default:
                    // Default case will also not be executed due to the same reason
                    result += i * 2;
                    break;
            }
        }
        return result;
    }

    // Method to provide a dynamic condition that always evaluates to false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}