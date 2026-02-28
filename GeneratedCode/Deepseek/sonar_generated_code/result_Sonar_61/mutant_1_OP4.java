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

    public void unreachableCodeMutant() {
        boolean condition = false;
        if (condition) {
            // Unreachable code
            setX(1234);
        } else {
            setX(5678);
        }
    }
}