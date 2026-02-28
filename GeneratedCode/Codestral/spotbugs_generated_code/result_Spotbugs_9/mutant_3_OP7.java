class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Original bug: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        boolean condition = x == 0 || x == 0;

        // Mutated code: Insert an unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This line should never execute");
        }

        return condition;
    }
}