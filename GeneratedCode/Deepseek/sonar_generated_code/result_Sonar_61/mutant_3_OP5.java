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
        // Unreachable switch statement:
        int zero = 0;
        switch (zero) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return getY();
    }
}