class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        int taatizlj = 0;switch  (taatizlj) {case 1:short guudegvv = -9833;break;default:byte hxfwzhhb = -79;break;}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}