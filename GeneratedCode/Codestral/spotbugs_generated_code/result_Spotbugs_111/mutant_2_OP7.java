class DeadParameterBug {
    public int showBug(int input) {
        boolean unreachableCondition = false; // Non-compile-time constant
        while (unreachableCondition) {
            // Inserted unreachable while loop
            System.out.println("This line will never be executed");
        }

        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        return input;
    }
}