class BitwiseBug {
    public boolean showBug(int number) {
        int n = number; // mutant: renamed 'number' to 'n'
        if ((n & 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
}