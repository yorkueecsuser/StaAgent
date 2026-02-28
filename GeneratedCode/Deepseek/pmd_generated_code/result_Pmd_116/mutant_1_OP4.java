class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                if (false) {
                    System.out.println("This branch is unreachable");
                }
                break;
        }
    }
}