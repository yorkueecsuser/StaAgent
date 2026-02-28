class BugExample {

    private int x;
    private int y;
    private boolean shouldRun = true;

    // Mutated code
    public void setX(int val) {
        this.y = val;
    }

    public int getY() {
        return this.x;
    }

    public int showBug() {
        if (shouldRun) {
            setX(10);
        } else {
            // Unreachable code
            setX(20);
        }
        return getY();
    }
}