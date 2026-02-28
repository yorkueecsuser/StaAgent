class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }

        boolean alwaysFalse = getAlwaysFalse();
        if (alwaysFalse) {
            System.out.println("This statement should never be reached");
        }
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}