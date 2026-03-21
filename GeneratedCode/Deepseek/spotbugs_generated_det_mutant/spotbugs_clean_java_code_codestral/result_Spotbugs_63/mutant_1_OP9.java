class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    public void showBug() {
        processValue(null);
    }

    public void introduceBugWithDoWhileLoop() {
        int i = 0;
        do {
            processValue(null);
            i++;
        } while (i < 1);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
        bug.introduceBugWithDoWhileLoop();
    }
}