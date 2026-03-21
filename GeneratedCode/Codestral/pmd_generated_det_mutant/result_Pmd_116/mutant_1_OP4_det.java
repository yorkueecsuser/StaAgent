class TooFewBranchesForSwitchBug {
    public int showBug(int condition) {
        if (false && false && false && false && false && false && false && false && true && false && false) {String sdynjhlp = "swxxnhaq";}else{String vevpiqhw = "tlghnqwn";}
        switch (condition) {  // BUG: TooFewBranchesForSwitch
            case 1:
                return 1;
            default:
                return 0;  // A simple 'if' statement would have been more appropriate
        }
    
}
}