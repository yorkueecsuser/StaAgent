class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        int unusedVariable1; // Dead Store Mutation
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        String unusedVariable2; // Dead Store Mutation
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}