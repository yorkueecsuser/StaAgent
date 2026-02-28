class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        processValue(null);

        // Mutant for Unreachable switch statement
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}