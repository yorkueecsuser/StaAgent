class BugExample {

    private int x;
    private int y;

    // BUG: Getters and setters should access the expected fields
    public void setX(int val) {
        this.y = val;
    }

    public int getY() {
        return this.x;
    }

    public int showBug() {
        // Mutation Operator: Duplication
        // Duplicating the assignment statement "this.y = val"
        this.y = val;
        setX(10);
        return getY();
    }
}