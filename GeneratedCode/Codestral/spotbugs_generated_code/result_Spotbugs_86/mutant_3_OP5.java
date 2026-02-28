class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            // Mutant: Unreachable switch statement
            int value = getValue();
            switch (value) {
                case 0: // Always false
                    System.out.println("This line should never be executed.");
                    break;
            }
            return true;
        } else {
            return false;
        }
    }

    // Helper method to return a non-zero value
    private int getValue() {
        return number; // This is just an example, replace with any logic that returns a non-zero value
    }
}