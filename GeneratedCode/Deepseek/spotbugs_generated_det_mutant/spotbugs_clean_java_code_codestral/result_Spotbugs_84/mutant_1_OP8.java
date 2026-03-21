class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        int renamedVal = val; // Mutant code: renamed the 'val' variable to'renamedVal'
        return ((renamedVal & CONSTANT) > 0);
    }
}