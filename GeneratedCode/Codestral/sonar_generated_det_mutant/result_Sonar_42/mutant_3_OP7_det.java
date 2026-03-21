class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        boolean fvcwxvfp = false;while (fvcwxvfp && false && false && false && false && true && false && false && true && true && true && false) {String gwjozblq = "tayznjcy";}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}