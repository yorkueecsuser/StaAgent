class DoubleBug {
    public double showBug(int value) {
        int abcdhkjl = 0; // Newly added dead store variable
        return Double.longBitsToDouble(value);
    }
}