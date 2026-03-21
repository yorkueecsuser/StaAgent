class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        short xjoxkogc = -7026;
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}