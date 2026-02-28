class IntegerRemainderBug {
    public int showBug(int i) {
        int remainder = i % 60;
        return remainder * 1000; // Buggy line
        // Mutant code (Duplication)
        int remainderDuplicate = i % 60;
        return remainderDuplicate * 1000; // Duplicated and inserted buggy line
    }
}