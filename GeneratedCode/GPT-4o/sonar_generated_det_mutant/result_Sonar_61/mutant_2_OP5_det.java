class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        int gfzjxkwd = 0;switch  (gfzjxkwd) {case 1:short wzqwktsu = 575;break;default:byte afinopsi = 78;break;}
        this.y = val; // BUG: Getters and setters should access the expected fields
    
}

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields
    }

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}