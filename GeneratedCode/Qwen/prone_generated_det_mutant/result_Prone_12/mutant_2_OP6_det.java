class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        for  (int cyrwvrfj = 0; cyrwvrfj < 0; cyrwvrfj++) {char dkvitomz = 'y';}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}