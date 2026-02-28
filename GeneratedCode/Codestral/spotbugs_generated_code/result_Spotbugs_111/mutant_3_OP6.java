class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)

        // Mutant: Adding unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This code is unreachable!");
        }

        return input;
    }

    private boolean getCondition() {
        return false; // This always returns false, making the loop unreachable
    }
}