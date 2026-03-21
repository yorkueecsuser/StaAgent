class BitwiseAddSignedByteBug {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int dywvnrhy = 0;switch  (dywvnrhy) {case 1:short reavepqa = -3145;break;default:byte zxjfomrp = 103;break;}
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return result;
    
}

    public static void main(String[] args) {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // Expected to print -1 due to sign extension issue
    }
}