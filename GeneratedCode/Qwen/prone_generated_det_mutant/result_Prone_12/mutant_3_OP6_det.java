class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        for  (int hivxoomq = 0; hivxoomq < 0; hivxoomq++) {char kiroinqt = 'v';}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}