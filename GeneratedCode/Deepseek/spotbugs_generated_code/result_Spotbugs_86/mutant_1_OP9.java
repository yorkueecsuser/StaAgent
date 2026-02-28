class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        int i = 0;
        do {
            if ((number & 0) == 0) {
                return true;
            }
            i++;
        } while (i < 1);

        return false;
    }
}