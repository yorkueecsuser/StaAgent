class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }

    // Mutation Operator: Dead Store
    // Description: Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic book in the program. The name of the variable is a string of eight characters randomly generated in the form of [a-z]. Only one dead store is added in each transformation by this operator.

    // Generated mutated Java code:

    // Generating a random unused variable name
    private String randomVarName = "deadStore";

    // Replaced the existing return statement with the new variable declaration
    public String showBugMutant(String string) {
        // Original code
        if (string!=null ||!string.equals(""))
            return string;
        return null;

        // Mutated code
        if (string!=null ||!string.equals(""))
            return string;
        else
            return randomVarName;
    }
}