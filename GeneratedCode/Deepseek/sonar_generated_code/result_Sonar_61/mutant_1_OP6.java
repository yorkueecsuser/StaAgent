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
        for(int i = 0; i < 1; i++) {
            if(i == 0) {
                break;
            }
            System.out.println("This is an unreachable code.");
        }
        return getY();
    }
}