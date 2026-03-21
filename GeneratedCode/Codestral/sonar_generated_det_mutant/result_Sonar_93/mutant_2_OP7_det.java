class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        boolean wkvpwpcw = false;while (wkvpwpcw && false && false && true && false && true && true && false && true && false && false && false) {long atibcvqz = -454214328;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}