class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        boolean condition = false;
        if ((number & 0) == 0) {
            // MUTANT: Unreachable for loop
            for (int i = 0; condition; i++) {
                System.out.println("This is an unreachable loop");
            }
            return true;
        } else {
            return false;
        }
    }
}