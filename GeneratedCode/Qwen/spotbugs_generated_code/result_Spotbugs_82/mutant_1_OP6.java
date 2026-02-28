class BitwiseAddSignedByteBug {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE) 

            // Unreachable for loop
            boolean conditionFor = getUnreachableCondition();
            for (int j = 0; conditionFor; j++) {
                // This loop is unreachable because conditionFor is always false
            }
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // Expected to print -1 due to sign extension issue
    }
}