class BugExample {

    private int x;
    private int y;

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

    // Newly added method to add mutation
    public boolean getCondition() {
        return false;
    }

    // Newly added method to add mutation
    public int getValue() {
        return 0;
    }
}