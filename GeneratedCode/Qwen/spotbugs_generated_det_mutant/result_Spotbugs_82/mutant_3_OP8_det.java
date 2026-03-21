class BitwiseAddSignedByteBug {

    public int showBug(byte[] b) {
        int cgbejrqm = 0;
        for (int i = 0; i < 4; i++) {
            cgbejrqm = ((cgbejrqm << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return cgbejrqm;
    }

    public static void main(String[] args) {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // Expected to print -1 due to sign extension issue
    }
}