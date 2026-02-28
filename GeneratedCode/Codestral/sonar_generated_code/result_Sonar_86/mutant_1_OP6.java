class ByteShiftBug {
    public int showBug(byte b) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        int shifted = b << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shifted;
    }

    // Method to determine the loop condition dynamically at runtime
    private boolean getCondition() {
        return false;
    }
}