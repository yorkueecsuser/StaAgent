class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // Original buggy line

            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("This line should never be reached.");
            }
        }
        return result;
    }
}