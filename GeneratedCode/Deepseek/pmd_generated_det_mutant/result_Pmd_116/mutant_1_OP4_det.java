class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                if (false && true && true && false && true && false && true && true && true && false && false) {String otcruoqv = "eaarzddz";}else{short fxctbqfc = -1133;}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}