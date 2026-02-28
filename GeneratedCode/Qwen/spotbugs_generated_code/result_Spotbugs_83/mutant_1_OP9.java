class BitwiseBugExample {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 
        }

        // Mutated code using Equivalent Loop Replacement
        int resultMutated = 0;
        int i = 0;
        do {
            resultMutated = ((resultMutated << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 
            i++;
        } while (i < 4);

        return result;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // This will print -1 due to the bug
    }
}