class IntegerRemainderBug {
    public int showBug(int inputValue) {
        int remainder = inputValue % 60; // renamed 'i' to 'inputValue'
        return remainder * 1000; // Buggy line
    }
}