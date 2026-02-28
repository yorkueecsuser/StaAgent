class BitwiseBug {
    public boolean showBug(int number) {
        // Original bug
        if ((number & 0) == 0) {
            // Mutated code with Dead Store mutation operator
            int deadStoreVariable = 10;
            return true;
        } else {
            return false;
        }
    }
}