class BuggyForLoop {
    public int showBug() {
        int sum = 0;
        { int i = 10; do { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i; i--; } while (i >= 0); }
        return sum;
    }
}