class BitwiseBug {
    public boolean showBug(int number) {
        // Original code
        if ((number & 0) == 0) {
            return true;
        }

        // Mutated code
        if ((number & 0) == 0) {
            // Duplicated check statement
            return true;
        } else {
            return false;
        }
    }
}