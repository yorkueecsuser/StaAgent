class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
if (true && true && true && false && true && false && true && false && true && true && false) {boolean zkizynfu = false;}else{long zntkqrqb = 587590039;}

        return this.x; // BUG: Getters and setters should access the expected fields
    
}

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}