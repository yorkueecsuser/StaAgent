class BugExampleMutant {

    private int x;
    private int y;

    //BUG: Getters and setters should access the expected fields
    public void setY(int val) {
        this.y = val;
    }

    public int getY() {
        return this.y;
    }

    public int showBug(){
        setX(10);
        return getY();
    }

    public void setX(int val) {
        this.x = val;
        boolean unreachableCondition = false; 
        if(unreachableCondition) {
            this.x = 100; // Unreachable code to avoid unreachable statement error
        }
    }
}