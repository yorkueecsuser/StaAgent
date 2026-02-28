class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Original bug
        if ((e & A | B) == C) {
            // Unreachable switch statement mutation
            boolean isUnreachable = e == A && B == C; // This condition will always be false
            switch (isUnreachable) {
                case true:
                    System.out.println("This line should never execute.");
                    break;
            }
            return true;
        }
        return false;
    }
}