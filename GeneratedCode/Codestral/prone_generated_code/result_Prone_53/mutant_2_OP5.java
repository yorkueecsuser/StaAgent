class BugDemonstration {

    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable switch statement - this case will never be executed
                    // as the value returned by getValue() is not 1.
                    System.out.println("This line will never be executed.");
                    break;
            }
        }
        return overriddenMethod();
    }

    public String showBug() {
        return nonOverriddenMethod();
    }

    // Methods to return dynamic values for the condition and switch expression
    private boolean getCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    private int getValue() {
        return 0; // This method always returns 0 to make the switch statement unreachable
    }
}