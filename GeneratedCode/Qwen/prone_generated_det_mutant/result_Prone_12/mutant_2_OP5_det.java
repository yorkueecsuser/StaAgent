class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        int adjaufxb = 0;switch  (adjaufxb) {case 1:String sqrntjvm = "pbgzhaqm";break;default:long ovnepkya = 441973050;break;}
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug
    
}

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}