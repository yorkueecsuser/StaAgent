class TooFewBranchesForSwitch {
    private boolean unreachableCondition = false;
    
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                if (unreachableCondition) {
                    // Unreachable statement
                    System.out.println("Unreachable");
                }
                break;
        }
    }
}