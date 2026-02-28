class IntegerRemainderBug {
    public int showBug(int i) {
        int uselessVar = 0;  // Mutant: Dead Store
        return i % 60 * 1000; // Buggy line
    }
}