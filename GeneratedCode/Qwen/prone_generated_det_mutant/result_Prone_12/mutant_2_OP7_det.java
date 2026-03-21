class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        boolean gwhchlhi = false;while (gwhchlhi && true && true && false && true && false && false && true && true && false && false && false) {short iyggowjn = 8875;}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}