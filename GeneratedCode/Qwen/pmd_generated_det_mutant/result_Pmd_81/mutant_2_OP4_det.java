class UnnecessaryConversionExample {

    // Method to demonstrate the bug
    public String showBug(int x) {
        if (false && true && false && true && false && true && false && false && false && false && false) {boolean jcwognun = false;}else{double fgprcqoz = 407510522;}
        String foo = new Integer(x).toString(); // BUG: UnnecessaryConversionTemporary
        return foo;
    
}

    // Main method for testing purposes
    public static void main(String[] args) {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        System.out.println(example.showBug(42));
    }
}