class ForLoopBugExample {

    // Method to demonstrate the bug
    public int showBug(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            result += i;
        }
        return result;
    }

    // Mutated method with renamed variable
    public int showBugMutated(int x, int y) {
        int z = 0;
        for (int a = x; a < y; a--) { // BUG: A "for" loop update clause should move the counter in the right direction
            z += a;
        }
        return z;
    }

    public static void main(String[] args) {
        ForLoopBugExample example = new ForLoopBugExample();
        System.out.println("Result of showBug(0, 10): " + example.showBug(0, 10));
        System.out.println("Result of showBugMutated(0, 10): " + example.showBugMutated(0, 10));
    }
}