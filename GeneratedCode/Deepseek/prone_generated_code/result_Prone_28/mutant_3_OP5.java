class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    // Mutation: Unreachable switch statement
    public boolean getCondition() {
        return false;
    }
    public void mutationUnreachableSwitch() {
        boolean condition = getCondition();
        switch (0) {
            case 0:
                if (condition) {
                    System.out.println("Unreachable");
                }
                break;
            default:
                break;
        }
    }
}