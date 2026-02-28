class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        boolean unreachableCondition = falseMethod(); // Inserting unreachable if-else branch
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This line should never be executed");
        } else {
            // This block is always executed
            return shifted;
        }
    }

    private boolean falseMethod() {
        // This method always returns false, making the if-block unreachable
        return false;
    }
}