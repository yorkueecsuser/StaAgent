class NullParameterExample {

    public void printString(String str) {
        System.out.println(str.length());
    }

    public int showBug() {
        printString(null); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Added a unique loop for mutation
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Applying Equivalent Loop Replacement mutation operator
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return -1; // Return value is not relevant to the bug demonstration
    }

    public static void main(String[] args) {
        NullParameterExample example = new NullParameterExample();
        example.showBug();
    }
}