class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This for loop is unreachable because the condition is always false.
            System.out.println("This code should not be executed.");
        }
        return shifted;
    }

    private boolean getCondition() {
        // Replace this method with a real implementation that returns false.
        return false;
    }
}