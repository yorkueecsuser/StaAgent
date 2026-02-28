class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never be executed because the condition is always false
            System.out.println("This is an unreachable loop");
        }
        return value == 200;
    }
}