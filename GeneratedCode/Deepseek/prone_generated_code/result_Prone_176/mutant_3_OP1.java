class XorPowerBug {

    // BUG: XorPower
    private int uniqueVariable = 12345; // Dead Store Mutation

    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}