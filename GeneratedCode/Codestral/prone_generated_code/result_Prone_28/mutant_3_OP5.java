class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        int unreachableValue = getUnreachableValue(); // Method call to ensure the value is dynamically determined at runtime

        switch (unreachableValue) {
            case 1:
                System.out.println("This code should never be executed");
                break;
        }
        return NANOS_PER_DAY;
    }

    private int getUnreachableValue() {
        return 2; // This value will never match the case statement, making the switch unreachable
    }
}