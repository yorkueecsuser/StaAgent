class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        Object newObj = obj; // New variable created and named 'newObj'
        return newObj instanceof String; // 'newObj' is used instead of 'obj'
    }
}