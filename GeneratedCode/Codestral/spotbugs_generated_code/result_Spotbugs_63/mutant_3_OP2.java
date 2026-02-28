class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
        String duplicateValue = nonNullValue; // MUTANT: Duplication of the non-null parameter
        System.out.println(duplicateValue.length()); // This line will also cause the bug if the original parameter is null
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}