class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;
            result += i; // Mutation: Duplicated the assignment statement
        }
        return result;
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
    }
}