class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        processValue(null);
        // Mutant code - Duplication of the assignment statement
        processValue(null); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}