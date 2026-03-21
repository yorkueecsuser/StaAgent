class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        if (true && true && true && true && true && false && false && false && false && true && false) {int iyrgptle = -373160778;}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}