class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Mutation: Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition(); // Using a method to ensure condition is determined at runtime
        while (conditionWhile) {
            System.out.println("This is an unreachable code block.");
        }
    }

    public boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}