class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());

        // Mutant code - Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // do nothing
        }
    }

    // Auxiliary method for mutant generation
    private static boolean getCondition() {
        return false;
    }
}