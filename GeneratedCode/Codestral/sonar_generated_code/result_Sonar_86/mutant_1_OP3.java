class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        // Added Unreachable If Statement Mutant
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code.");
        }
        return shifted;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }
}