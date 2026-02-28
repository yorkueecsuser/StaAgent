class NonNullParameterBug {

    private boolean getCondition() {
        return false;
    }

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length()); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)

        // Mutation - Unreachable switch statement
        int value = (int)(Math.random() * 10); // To ensure the switch statement is unreachable
        switch (value) {
            case 10:
                System.out.println("This line should never be reached.");
                break;
        }
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}