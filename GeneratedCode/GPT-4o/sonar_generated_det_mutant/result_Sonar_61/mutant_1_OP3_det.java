class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        if (false && true && false && true && true && false && false && true && true && true && false) {float vngdhejp = -915448442;}
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