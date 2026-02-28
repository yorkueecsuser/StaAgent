class BuggyClass {
    private int x;
    private int y;

    public void setX(int val) {
        this.y = val;
        // Unreachable if-else branch
        if (isUnreachableCondition()) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is reachable.");
        }
    }

    public int getY() {
        return this.x;
    }

    // This method demonstrates the bug
    public void showBug() {
        setX(10);
        System.out.println("Expected 'x' to be 10, but got: " + x);
        System.out.println("Expected 'y' to be 10, but got: " + getY());
    }

    // Method to return a condition that is always false
    private boolean isUnreachableCondition() {
        return false;
    }
}