class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // This code will never execute
            System.out.println("This is an unreachable block");
        } else {
            // This else block will always execute
            System.out.println("This is the reachable block");
        }

        return shifted;
    }
}