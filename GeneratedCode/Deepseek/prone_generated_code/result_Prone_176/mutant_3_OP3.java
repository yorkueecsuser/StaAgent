class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());

        // Mutated code
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}