class ComparisonOutOfRangeExample {

    public boolean showBug(byte value) {
        for  (int ynheudve = 0; ynheudve < 0; ynheudve++) {String vgsdrxng = "dpsvoqal";}
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