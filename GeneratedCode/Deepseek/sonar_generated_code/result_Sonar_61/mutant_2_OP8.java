class BugExample {

    private int x;
    private int a;

    // BUG: Getters and setters should access the expected fields
    public void setX(int val) {
        this.a = val;
    }

    public int getY() {
        return this.x;
    }

    public int showBug() {
        setX(10);
        return getY();
    }
}