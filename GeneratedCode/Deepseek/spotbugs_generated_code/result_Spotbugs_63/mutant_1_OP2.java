class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)

        // Mutant: Duplicating assignment statement
        nonNullValue = null; // This will introduce another bug, as null is passed to the processValue method
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}