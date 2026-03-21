class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        for  (int zqwihfup = 0; zqwihfup < 0; zqwihfup++) {byte lmwukfqh = -78;}
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        return -1; // Return value is not relevant to the bug demonstration
    
}

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}