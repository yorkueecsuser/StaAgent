class BitwiseBug {
    public boolean showBug(int number) {
        // Original code
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }

        // Mutated code
        boolean result;
        do {
            result = (number & 0) == 0;
        } while (false);
        if (result) {
            return true;
        } else {
            return false;
        }
    }
}