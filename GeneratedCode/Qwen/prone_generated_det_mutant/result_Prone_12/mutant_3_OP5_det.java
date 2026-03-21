class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        int bizbykkd = 0;switch  (bizbykkd) {case 1:long jozffwle = -908543707;break;default:double krfmgmde = -793493295;break;}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}