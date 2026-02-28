class ByteShiftBug {
    public int showBug(byte b) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This line is unreachable");
        }
        int shifted = b << 24;
        return shifted;
    }
}