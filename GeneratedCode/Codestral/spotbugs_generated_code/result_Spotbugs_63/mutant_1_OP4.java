class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable due to the false condition.");
        } else {
            processValue(null); // Original bug remains
        }
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}