class BitwiseBug {
    public boolean showBug(int number) {
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
        // MUTANT: Duplication of the applicable assignment statement
        if ((number & 0) == 0) {
            // This is a duplicate of the above line, which should not have any side effect
        }
    }
}