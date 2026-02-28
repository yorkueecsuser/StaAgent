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
}

class MutantBugExample {

    private int a;
    private int b;

    // BUG: Getters and setters should access the expected fields
    public void setA(int val) {
        this.b = val;
    }

    public int getB() {
        return this.a;
    }

    public int showMutantBug() {
        setA(10);
        return getB();
    }
}