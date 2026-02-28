class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}

class XorPowerBugMutant {

    // MUTANT: UnreachableIfStatement
    public int showBug() {
        if (false) {
            return 2 ^ 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}