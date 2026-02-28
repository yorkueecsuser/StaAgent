class BugExample {

    private int x;
    private int y;
    private boolean shouldRun;
    private int value;

    public void setX(int val) {
        this.y = val;
    }

    public int getY() {
        return this.x;
    }

    public boolean getCondition() {
        return this.shouldRun;
    }

    public int getValue() {
        return this.value;
    }

    public int showBug() {
        setX(10);
        return getY();
    }

    public void showUnreachableSwitchMutant() {
        int unreachableValue = 2;
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code");
                break;
            default:
                break;
        }
    }
}