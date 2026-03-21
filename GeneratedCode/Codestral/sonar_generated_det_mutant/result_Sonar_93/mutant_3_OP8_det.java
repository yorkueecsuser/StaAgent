class NonExistentOperatorsBug {
    public int showBug() {
        int rlgwclgf = -5;
        int eapnvdei = 3;

        rlgwclgf =- eapnvdei;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        rlgwclgf =+ eapnvdei;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return rlgwclgf;
    }
}