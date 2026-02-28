class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)

        // Mutated Code
        boolean switchCondition = false; // Using a variable to avoid unreachable statement error
        switch (switchCondition) {
            case true:
                System.out.println("This is an unreachable switch statement");
                break;
        }

        return input;
    }
}