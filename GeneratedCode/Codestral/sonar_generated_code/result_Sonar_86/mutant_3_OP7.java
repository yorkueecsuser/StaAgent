class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;

        // Mutant code: Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop is unreachable as the condition is always false
            System.out.println("This is an unreachable loop");
        }

        return shifted;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}