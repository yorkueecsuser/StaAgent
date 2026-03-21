class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        for  (int mgiclknc = 0; mgiclknc < 0; mgiclknc++) {long vbtilvbf = -490285153;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}