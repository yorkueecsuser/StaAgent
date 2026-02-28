class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        int x = 2;
        return x ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}