class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("Unreachable code");
        }

        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
}