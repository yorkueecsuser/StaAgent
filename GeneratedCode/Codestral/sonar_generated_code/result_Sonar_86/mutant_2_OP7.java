class ByteShiftBug {
    public int showBug(byte b) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
        }
        int shifted = b << 24;
        return shifted;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}