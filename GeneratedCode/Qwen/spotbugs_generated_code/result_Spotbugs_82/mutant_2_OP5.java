class BitwiseAddSignedByteBug {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)

            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case is unreachable because condition is always false
                    result = result + 1; // Some unique operation
                    break;
                case 1:
                    // This case is always executed
                    break;
            }
        }
        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }

    public static void main(String[] args) {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // Expected to print -1 due to sign extension issue
    }
}