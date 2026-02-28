class XorPowerBug {
    
    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    // Mutant Code: Unreachable If-Else Statement
    public void unreachableIfElse() {
        if (false) {
            System.out.println("This is an unreachable block");
        } else {
            System.out.println("This is the reachable block");
        }
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        bug.unreachableIfElse();
    }
}