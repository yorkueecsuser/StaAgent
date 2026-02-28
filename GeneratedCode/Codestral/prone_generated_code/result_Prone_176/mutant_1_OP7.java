class XorPowerBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int base, int exponent) {
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) {
            System.out.println("This is an unreachable loop");
        }
        return base ^ exponent;
    }
}