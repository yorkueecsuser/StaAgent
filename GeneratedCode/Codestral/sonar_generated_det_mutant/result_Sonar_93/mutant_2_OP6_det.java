class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        for  (int jduzbvge = 0; jduzbvge < 0; jduzbvge++) {int hbgrggul = 428747760;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}