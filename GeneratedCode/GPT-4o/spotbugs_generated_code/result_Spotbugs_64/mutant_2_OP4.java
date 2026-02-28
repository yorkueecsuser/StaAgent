class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        
        // Mutation: Unreachable if-else statement
        // Using a non-final variable to ensure no unreachable statement error
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("Continuing normal execution.");
        }
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}