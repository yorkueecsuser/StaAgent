class IntegerRemainderBug {
    public int showBug(int i) {
        int unusedVar = 10; // Added dead store
        return i % 60 * 1000; // Buggy line
    }
}