class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    // Utility method to determine loop condition at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}