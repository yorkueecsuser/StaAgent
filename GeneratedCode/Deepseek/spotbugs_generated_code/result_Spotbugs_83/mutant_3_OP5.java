class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // Original bug is still present

            // Mutation: Unreachable switch statement
            switch (false) {
                case true:
                    System.out.println("This line should never execute.");
                    break;
            }
        }
        return result;
    }
}