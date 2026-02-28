class ShiftBug {
    public int showBug(int x, int y) {
        int value = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)

        // Mutant: Unreachable switch statement
        boolean shouldRun = false; // Ensuring the switch statement is unreachable
        if (shouldRun) {
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code executed!");
                    break;
            }
        }

        return value;
    }
}