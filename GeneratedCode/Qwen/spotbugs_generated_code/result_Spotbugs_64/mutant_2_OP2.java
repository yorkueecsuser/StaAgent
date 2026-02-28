class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        int duplicateVariable = 0; // Original assignment statement
        int duplicateVariable = 0; // Duplicated assignment statement
        return -1; // Return value is not relevant to the bug demonstration
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}