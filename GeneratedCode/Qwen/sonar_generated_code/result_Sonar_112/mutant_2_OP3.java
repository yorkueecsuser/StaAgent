class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                result -= i; // This branch is unreachable
            }
        }
        return result;
    }

    // Method to provide a dynamically determined condition that is always false
    private boolean getUnreachableCondition() {
        return false; // This method is intended to always return false, making the if branch unreachable
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}