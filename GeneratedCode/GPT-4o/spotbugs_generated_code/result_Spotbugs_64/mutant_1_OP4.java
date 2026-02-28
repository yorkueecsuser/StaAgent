class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            System.out.println("This should never print.");
        } else {
            // Original code remains here
            String value = null;
            notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        }
    }

    private boolean getCondition() {
        return false; // The condition is designed to always be false
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}