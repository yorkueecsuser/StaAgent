class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            System.out.println("This is unreachable code.");
        }
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    private boolean getCondition() {
        // Return false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}