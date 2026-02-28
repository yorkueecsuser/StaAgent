class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        int a = 2;
        return a ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}