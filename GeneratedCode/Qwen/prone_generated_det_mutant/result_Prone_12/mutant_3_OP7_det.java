class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        boolean jgpcajkf = false;while (jgpcajkf && true && false && true && true && true && true && true && true && true && false && false) {double jczpubqe = 639077307;}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}