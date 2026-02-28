class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        boolean loopCondition = getLoopCondition();
        while (loopCondition) {
            // This block is intentionally unreachable due to loopCondition being false
            System.out.println("This is an unreachable while loop block.");
        }

        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
    
    private boolean getLoopCondition() {
        return false; // The condition is always false, making the while loop unreachable
    }
}