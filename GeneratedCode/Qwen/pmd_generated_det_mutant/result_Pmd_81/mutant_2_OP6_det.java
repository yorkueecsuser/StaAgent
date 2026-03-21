class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        for  (int mfakcjdg = 0; mfakcjdg < 0; mfakcjdg++) {double ueakdjkm = 492577961;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}