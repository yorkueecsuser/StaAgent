class IntegerRemainderBug {
    public int showBug(int i) {
        int rem = i % 60;
        return rem * 1000; // Buggy line
        int duplicatedRem = rem * 1000; // Mutated line: duplicate the buggy line
    }
}