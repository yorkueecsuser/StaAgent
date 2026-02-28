class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    // Mutation Operator: Duplication
    // Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation.
    // Output: Generated mutated Java code must maintain the original code (the original code must be left in place, do not remove from it only add code to it).
    // Output: Generated mutated Java code must compile successfully.
    // Output: Mutant code being added must be unique not generic.
    // Output: Generated mutated Java code must maintain all original import and package statements to ensure successful compilation.
    // Output: Generated mutated Java code must avoid unreachable statement error.

    // Apply mutation operator to the following line:
    // return false;
    return false;
    return false;
}