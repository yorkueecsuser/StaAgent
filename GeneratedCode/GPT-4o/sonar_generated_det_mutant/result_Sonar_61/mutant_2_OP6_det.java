class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        for  (int ttzmbemz = 0; ttzmbemz < 0; ttzmbemz++) {long rbnpfath = 688334653;}
        this.y = val; // BUG: Getters and setters should access the expected fields
    
}

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields
    }

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}