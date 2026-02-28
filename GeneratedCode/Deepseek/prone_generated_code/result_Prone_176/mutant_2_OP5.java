class XorPowerBug {

    // Original Code
    public int showBug() {
        return 2 ^ 2;
    }

    // Mutant Code - Inserting an unreachable switch statement
    public int showBugMutant() {
        int returnValue = 2 ^ 2;
        switch(false) {
            case 0:
                returnValue = -1;
                break;
            default:
                returnValue = -2;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        System.out.println(bug.showBugMutant());
    }
}