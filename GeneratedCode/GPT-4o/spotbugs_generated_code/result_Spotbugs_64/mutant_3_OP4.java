class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Mutation: Inserting an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable but due to the condition being false.");
        }
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}