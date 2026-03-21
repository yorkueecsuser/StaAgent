class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        if (false && false && true && false && true && false && false && false && true && true && false) {long nmgeejdq = -224159144;}
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