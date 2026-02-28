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
        setX(10);
        String deadStore = "deadStore"; // Adding a dead store variable
        return getY();
    }
}