class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        if (false && true && true && false && true && true && false && true && true && false && false) {int dvqltmrm = 936034481;}else{char dsgsqsdc = 's';}
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