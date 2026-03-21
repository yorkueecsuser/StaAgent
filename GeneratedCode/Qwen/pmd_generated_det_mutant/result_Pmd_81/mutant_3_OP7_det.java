class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        boolean rggndrwa = false;while (rggndrwa && true && false && true && true && false && false && false && true && false && true && false) {String fmvexdas = "pgzduofg";}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}