class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
for  (int zfqwuxvy = 0; zfqwuxvy < 0; zfqwuxvy++) {long gvcmfyby = 881806309;}

        return this.x; // BUG: Getters and setters should access the expected fields
    
}

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}