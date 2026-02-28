class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }

    private boolean getCondition() {
        return false; // This method will always return false at runtime
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}