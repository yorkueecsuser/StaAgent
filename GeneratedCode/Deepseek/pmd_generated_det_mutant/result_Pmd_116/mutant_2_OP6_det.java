class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                for  (int jlardwog = 0; jlardwog < 0; jlardwog++) {byte xmtwgexr = 33;}
                System.out.println("Condition is 1"); // BUG: TooFewBranchesForSwitch
                break;
            default:
                break; // not enough for a'switch' stmt, a simple 'if' stmt would have been more appropriate
        }
    
}
}