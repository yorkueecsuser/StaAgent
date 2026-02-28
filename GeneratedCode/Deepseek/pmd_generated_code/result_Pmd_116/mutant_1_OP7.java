class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                boolean conditionFor = getConditionFor(); 
                for (int i = 0; conditionFor; i++) { /* this is an unreachable while loop */ }
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    }

    public boolean getConditionFor() {
        return false;
    }
}