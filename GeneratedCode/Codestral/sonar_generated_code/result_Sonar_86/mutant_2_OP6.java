class ByteShiftBug {
    public int showBug(byte b) {
        boolean unreachableCondition = false;
        for (int i = 0; i < 1 && unreachableCondition; i++) {
            // Unreachable for loop inserted here
            System.out.println("This is an unreachable loop!");
        }
        int shifted = b << 24;
        return shifted;
    }

    private boolean getCondition() {
        return false; // This method always returns false to make the loop unreachable
    }
}