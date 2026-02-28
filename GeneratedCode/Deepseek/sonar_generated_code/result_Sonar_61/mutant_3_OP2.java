class BugExample {

    private int x;
    private int y;

    // BUG: Getters and setters should access the expected fields
    public void setX(int val) {
        this.y = val;
        // Mutant code added by the Duplication mutation operator
        this.y = val;
    }

    public int getY() {
        // Mutant code added by the Duplication mutation operator
        return this.x;
        return this.x;
    }

    public int showBug() {
        setX(10);
        // Mutant code added by the Duplication mutation operator
        setX(10);
        return getY();
    }
}