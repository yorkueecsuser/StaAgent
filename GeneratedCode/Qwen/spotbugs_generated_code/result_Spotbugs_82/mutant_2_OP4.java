class BitwiseAddSignedByteBug {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block is intended to be unreachable
                result = ((result << 8) + (b[i] & 0xff)); // Corrected code, but unreachable
            } else {
                result = ((result << 8) + b[i]); // Original buggy code
            }
        }
        return result;
    }

    private boolean getCondition() {
        // This method returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // Expected to print -1 due to sign extension issue
    }
}