class BugExample {

    private int x;
    private int y;
    private boolean condition;

    // BUG: Getters and setters should access the expected fields
    public void setX(int val) {
        this.y = val;
    }

    public int getY() {
        return this.x;
    }

    public int showBug() {
        condition = true;
        while (condition) {
            if (false) {
                continue;
            }
            setX(10);
            break;
        }
        return getY();
    }
}