class NonExistentOperatorsBug {
    public int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        for  (int evbcwtgq = 0; evbcwtgq < 0; evbcwtgq++) {float ardhqatj = -483809333;}
        target =+ num;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return target;
    
}
}