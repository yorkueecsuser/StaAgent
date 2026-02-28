class NonNullParameterBug {

    private boolean getFalseCondition() {
        return false;
    }

    private void processValue(String nonNullValue) {
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
        }
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}