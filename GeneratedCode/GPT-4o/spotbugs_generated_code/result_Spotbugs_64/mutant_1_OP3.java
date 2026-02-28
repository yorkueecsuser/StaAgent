class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Mutation: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block due to false condition.");
        }
    }

    // Helper method to ensure non-final variable usage
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}