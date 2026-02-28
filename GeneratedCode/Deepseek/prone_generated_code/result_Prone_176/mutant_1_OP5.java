class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());

        // Unreachable switch statement
        boolean unreachable = false;
        switch (unreachable? 1 : 0) {
            case 0:
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
    }
}