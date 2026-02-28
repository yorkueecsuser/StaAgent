class XorPowerBug {
    public int showBug(int base, int exponent) {
        int value = getUnreachableValue(); // This method should always return a value that makes the switch unreachable
        switch (value) {
            case 1:
                System.out.println("This is an unreachable switch statement");
                break;
        }
        return base ^ exponent; // BUG: XorPower
    }

    private int getUnreachableValue() {
        return -1; // This value is not covered by any case in the switch statement, making it unreachable
    }
}