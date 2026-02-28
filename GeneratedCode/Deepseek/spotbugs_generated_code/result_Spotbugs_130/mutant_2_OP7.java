class IntegerRemainderBug {
    public int showBug(int i) {
        while (getCondition()) { // Inserted unreachable while loop
            /* code */
        }
        return i % 60 * 1000; // Original buggy line
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}