class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // Original bug: IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN

        // Mutant code: Unreachable switch statement
        boolean shouldRun = false;
        switch (shouldRun? 1 : 0) {
            case 1:
                System.out.println("This code should not execute.");
                break;
        }

        return input;
    }
}