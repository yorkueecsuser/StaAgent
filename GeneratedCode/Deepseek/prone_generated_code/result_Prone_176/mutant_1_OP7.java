class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public int showFixedBug() {
        return 2 * 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        System.out.println(bug.showFixedBug());
    }
}