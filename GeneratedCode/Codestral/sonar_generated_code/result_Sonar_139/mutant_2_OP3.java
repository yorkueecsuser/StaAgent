class DoubleBug {
    public double showBug(int value) {
        boolean unreachableCondition = value < 0;
        if (unreachableCondition) {
            System.out.println("This line of code should never execute");
        }
        // Original code
        return Double.longBitsToDouble(value);
    }
}