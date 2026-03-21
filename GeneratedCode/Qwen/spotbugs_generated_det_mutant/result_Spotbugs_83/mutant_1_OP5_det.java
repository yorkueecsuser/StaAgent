class BitwiseBugExample {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int znftpkzz = 0;switch  (znftpkzz) {case 1:String ojilpvkm = "yqlwndoq";break;default:char qzefkoty = 'l';break;}
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 
        }
        return result;
    
}

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // This will print -1 due to the bug
    }
}