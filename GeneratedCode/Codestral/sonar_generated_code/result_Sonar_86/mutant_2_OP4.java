class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        return shifted;
    }

    public int unreachableMethod() {
        boolean shouldRun = false;
        if (shouldRun) {
            // This block is unreachable
            int unreachable = 10 / 0; // This line will cause a division by zero error if the unreachable block is executed
        } else {
            return 0;
        }
    }
}