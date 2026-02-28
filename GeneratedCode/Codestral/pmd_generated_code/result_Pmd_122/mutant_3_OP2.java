class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // Original code
            result += getStringFromSomeWhere(i);

            // Mutant code: Duplicate the assignment statement
            // Since the mutation operator excludes assignment statements with method invocation,
            // the mutant code is the same as the original code.
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}