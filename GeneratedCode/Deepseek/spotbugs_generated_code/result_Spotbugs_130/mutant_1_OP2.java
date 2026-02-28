class IntegerRemainderBug {
    public int showBug(int i) {
        return i % 60 * 1000; // Buggy line
        return i % 60 * 1000; // Mutant code: Duplicated buggy line
    }
}