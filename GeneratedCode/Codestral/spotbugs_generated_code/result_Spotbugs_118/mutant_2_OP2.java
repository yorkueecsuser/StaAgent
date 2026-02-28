class BuggyCode {
    public boolean showBug(Object obj) {
        // Original code
        return obj instanceof String;

        // Mutated code: Duplication of the assignment statement
        return obj instanceof String;
        // Note that the duplicate line is not necessary and does not add any functionality to the code,
        // but it is a valid mutation according to the Duplication Operator description.
    }
}