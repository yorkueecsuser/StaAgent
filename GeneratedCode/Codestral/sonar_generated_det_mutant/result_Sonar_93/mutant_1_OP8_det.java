class NonExistentOperatorsBug {
    public int showBug() {
        int gjxpnbzp = -5;
        int zxndcvmh = 3;

        gjxpnbzp =- zxndcvmh;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used
        gjxpnbzp =+ zxndcvmh;  // Noncompliant: BUG: Non-existent operators like "=+" should not be used

        return gjxpnbzp;
    }
}