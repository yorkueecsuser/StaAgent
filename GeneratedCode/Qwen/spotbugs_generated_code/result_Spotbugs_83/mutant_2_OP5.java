class BitwiseBugExample {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 

            // Unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 1 : 2) {
                case 1:
                    // This case will never be executed because condition is always false
                    result = 0; // This line is unreachable
                    break;
                case 2:
                    // This case will always be executed
                    result = result; // This line does nothing but is reachable
                    break;
            }
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the switch condition effectively false
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // This will print -1 due to the bug
    }
}