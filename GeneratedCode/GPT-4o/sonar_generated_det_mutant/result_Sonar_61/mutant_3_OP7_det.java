class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        boolean zxzpldiv = false;while (zxzpldiv && true && true && false && false && false && false && false && false && false && false && false) {String hajcokqn = "vmbuqety";}
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