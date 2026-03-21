class ComparisonOutOfRangeExample {

    public boolean showBug(byte value) {
        int nudjedwb = 0;switch  (nudjedwb) {case 1:char omhhcwbi = 'g';break;default:boolean svhwjfzo = false;break;}
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