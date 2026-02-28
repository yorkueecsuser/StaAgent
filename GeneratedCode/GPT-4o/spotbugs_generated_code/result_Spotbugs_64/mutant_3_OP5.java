class NullParameterViolationExample {

    public void notNullMethod(String param) {
        System.out.println(param.length());
    }

    public void showBug() {
        String value = null;
        notNullMethod(value); // BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)

        // Unreachable switch statement mutation
        int unreachableSwitchCondition = getSwitchCondition(); // This will be determined at runtime
        switch(unreachableSwitchCondition) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            // The following condition is never met as getSwitchCondition() will not return 3
            case 3:
                System.out.println("This is case 3");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    public int getSwitchCondition() {
        return 0; // Ensures case 3 is unreachable
    }

    public static void main(String[] args) {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug();
    }
}