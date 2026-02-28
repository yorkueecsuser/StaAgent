class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // Original bug

            // Mutation: Unreachable if-else statement
            boolean unreachableCondition = false; // This condition is always false
            if (unreachableCondition) {
                System.out.println("This line should never be executed.");
            } else {
                // This else block is unreachable
                int x = 1 / 0; // This line will throw an exception if it's ever executed
            }
        }
        return result;
    }
}