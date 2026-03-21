class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
int mmnfadue = 0;switch  (mmnfadue) {case 1:String ryfutymc = "sevpjjvm";break;default:short myzpausi = -8674;break;}

        return this.x; // BUG: Getters and setters should access the expected fields
    
}

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}