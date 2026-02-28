class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        boolean switchCondition = false;
        switch (switchCondition? 1 : 0) { // Using a false condition to make the switch statement unreachable
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
        }
        return NANOS_PER_DAY;
    }
}