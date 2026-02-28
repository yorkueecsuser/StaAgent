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
        setX(10);
        return getY();
    }

    public void unreachableSwitchStatement() {
        condition = false;
        switch (1) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }
}