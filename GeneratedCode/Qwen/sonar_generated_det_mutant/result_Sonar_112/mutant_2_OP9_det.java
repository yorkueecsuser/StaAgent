class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int sum = 0;
        { int i = start; do { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i; i--; } while (i < end); }
        return sum;
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(1, 10): " + example.showBug(1, 10));
    }
}