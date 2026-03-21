class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        if (false && false && false && false && false && false && false && true && true && false && false) {boolean ewjtrcrm = true;}else{long beutlspm = -552417104;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}