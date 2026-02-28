class ByteShiftBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(byte b) {
        while (getFalseCondition()) {
            // Unreachable while loop mutant
        }
        int shifted = b << 24;
        return shifted;
    }
}