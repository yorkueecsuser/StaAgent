class XorPowerBug {
    private boolean getFalse() {
        return false;
    }

    public int showBug(int base, int exponent) {
        int value = getFalse()? 1 : 0; // This expression always evaluates to 0, making the switch statement unreachable
        switch (value) {
            case 1:
                // This case is unreachable
                System.out.println("This is an unreachable case.");
                break;
        }
        return base ^ exponent; // BUG: XorPower
    }
}