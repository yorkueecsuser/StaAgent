class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public void mutant() {
        boolean conditionIf = false;
        boolean conditionWhile = false;
        boolean conditionFor = false;
        int valueSwitch = 0;

        if (conditionIf) {
            // This statement is unreachable
            System.out.println("This is an unreachable if statement");
        }

        while (conditionWhile) {
            // This statement is unreachable
            System.out.println("This is an unreachable while loop");
        }

        for (int i = 0; conditionFor; i++) {
            // This statement is unreachable
            System.out.println("This is an unreachable for loop");
        }

        switch (valueSwitch) {
            case 1:
                // This statement is unreachable
                System.out.println("This is an unreachable case in switch statement");
                break;
        }
    }
}