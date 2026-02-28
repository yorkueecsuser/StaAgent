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
        return getY();
    }

    public void introduceUnreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code will be inserted here
        }
    }
}