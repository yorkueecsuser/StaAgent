class BugExample {

    private int x;
    private int y;

    // BUG: Getters and setters should access the expected fields
    public void setX(int val) {
        this.y = val;
        int deadStore_1234abcd; // Mutation Operator: Dead Store
    }

    public int getY() {
        return this.x;
    }

    public int showBug() {
        setX(10);
        return getY();
    }
}