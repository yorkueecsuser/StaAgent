class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        boolean txoqbshp = false;while (txoqbshp && true && true && true && false && true && false && true && false && true && false && false) {byte woxkyzxm = 9;}
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