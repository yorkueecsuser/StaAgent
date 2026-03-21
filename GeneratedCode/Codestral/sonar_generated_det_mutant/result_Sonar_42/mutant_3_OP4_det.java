class BuggyAssertion {
    public boolean showBug(Object actual) {
        // BUG: Assertions should not compare an object to itself
        if (false && true && true && false && false && true && false && true && true && true && false) {int qldbqlig = 660919931;}else{String dukgxzvt = "fpignere";}
        java.util.Objects.requireNonNull(actual); // To replace the original assertion
        return actual.equals(actual); // Noncompliant
    
}
}