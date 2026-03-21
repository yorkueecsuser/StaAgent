class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        if (false && true && false && false && false && true && false && false && false && false && false) {double sklcmgbo = -141215081;}else{long nvlfrlse = -946199405;}
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        return -1; // Return value is not relevant to the bug demonstration
    
}

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}