class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        if (false && false && false && false && true && true && true && false && true && true && false) {String hruzlldy = "ochwfkmb";}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}