class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
for  (int ofvojhmz = 0; ofvojhmz < 0; ofvojhmz++) {boolean rsamihbo = true;}

        return this.x; // BUG: Getters and setters should access the expected fields
    
}

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}