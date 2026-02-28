class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        if (isFalseCondition()) { // Inserted unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return shifted;
    }

    private boolean isFalseCondition() {
        return false; // Always returns false to make the if statement unreachable
    }
}