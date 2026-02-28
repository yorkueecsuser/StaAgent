class BitwiseBugExample {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because conditionFor is never set to true
            System.out.println("This loop should never execute");
        }

        return result;
    }

    private boolean getCondition() {
        // This method returns false, ensuring the loop remains unreachable
        return false;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // This will print -1 due to the bug
    }
}