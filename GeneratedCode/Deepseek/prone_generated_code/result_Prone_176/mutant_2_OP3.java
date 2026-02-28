class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    // Mutation Operation: Unreachable if statement
    // Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
    public boolean getCondition() {
        return false;
    }

    public void showMutantBug() {
        if (getCondition()) {
            System.out.println(showBug());
        } else {
            System.out.println("This code is unreachable due to the mutation.");
        }
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        bug.showMutantBug();
    }
}