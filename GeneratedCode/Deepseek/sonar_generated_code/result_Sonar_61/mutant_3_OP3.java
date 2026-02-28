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
        if (false) {
            // This block of code is not reachable because the condition is always false
            this.y = 11;
            this.x = 12;
        }
        return getY();
    }
}