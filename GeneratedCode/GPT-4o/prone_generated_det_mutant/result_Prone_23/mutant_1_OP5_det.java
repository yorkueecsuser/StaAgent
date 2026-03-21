class ComparisonOutOfRangeExample {

    public boolean showBug(byte value) {
        int phhennzk = 0;switch  (phhennzk) {case 1:double kusehsce = -664519346;break;default:String ogaggouy = "qydhywcv";break;}
        // This comparison will always be false because 200 is outside the range of byte type
        return value == 200; // BUG: ComparisonOutOfRange
    
}

    public static void main(String[] args) {
        ComparisonOutOfRangeExample example = new ComparisonOutOfRangeExample();
        byte testValue = 100;
        
        // Demonstrate the bug
        boolean result = example.showBug(testValue);
        System.out.println("Comparison result: " + result);
    }
}