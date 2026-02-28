class ByteBitwiseBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (getUnreachableCondition()) {
                // Unreachable if statement inserted based on the mutation operator
                System.out.println("This line should never be printed.");
            }
            result = ((result << 8) | b[i]);
        }
        return result;
    }
}