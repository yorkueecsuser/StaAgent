class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        boolean wgrtrktr = false;while (wgrtrktr && true && false && false && false && false && false && false && true && true && false && false) {long oapxdjxn = 650336726;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}