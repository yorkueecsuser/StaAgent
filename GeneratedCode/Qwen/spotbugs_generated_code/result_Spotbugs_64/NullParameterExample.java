class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        return -1; // Return value is not relevant to the bug demonstration
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }

    // Mutated code starts here
    public void printString(String xyz) {
        System.out.println(xyz.length());
    }

    public int abc() {
        printString(null);
        return -1;
    }

    public static void main(String[] qwe) {
        NullParameterExample rty = new NullParameterExample();
        rty.abc();
    }
}