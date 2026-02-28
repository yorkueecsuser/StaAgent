class BitwiseBug {
    public boolean showBug(int number) {
        // Original code
        if ((number & 0) == 0) {
            return true;
        }

        // Mutated code: Duplicate the original if condition
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
}