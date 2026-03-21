class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        boolean trgobrxe = false;while (trgobrxe && true && false && false && false && false && false && false && true && true && true && false) {int wkeahbbo = 494297677;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}