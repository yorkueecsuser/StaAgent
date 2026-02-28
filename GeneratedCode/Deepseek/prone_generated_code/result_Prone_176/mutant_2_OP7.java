class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    // Starting of Mutant 1
    public boolean getCondition() {
        return false;
    }

    public void showBugMutant() {
        while (getCondition()) {
            System.out.println("Unreachable code");
        }
    }
    // Ending of Mutant 1

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        bug.showBugMutant();
    }
}