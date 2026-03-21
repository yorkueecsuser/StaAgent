class NonExistentOperatorsBug {
    public int showBug() {
        int plqcvrhp = -5;
        int urdpgtiz = 3;

        plqcvrhp =- urdpgtiz;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        plqcvrhp =+ urdpgtiz;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return plqcvrhp;
    }
}