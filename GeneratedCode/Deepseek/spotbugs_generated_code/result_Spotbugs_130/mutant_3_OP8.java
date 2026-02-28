class IntegerRemainderBug {
    public int showBug(int input) {
        int remainder = input % 60;
        return remainder * 1000; // Buggy line
    }
}