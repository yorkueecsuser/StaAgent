class BuggyCode {
    public boolean showBug(Object obj) {
        Object objMutant = obj; // Mutation: Renaming the variable 'obj' to 'objMutant'
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return objMutant instanceof String;
    }
}