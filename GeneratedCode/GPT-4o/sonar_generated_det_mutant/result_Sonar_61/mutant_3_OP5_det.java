class EncapsulationIssue {

    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
int ydcqughj = 0;switch  (ydcqughj) {case 1:float nvrnjcym = 10155176;break;default:String bmzpphpg = "tkcxwwpw";break;}

        return this.x; // BUG: Getters and setters should access the expected fields
    
}

    public int showBug(int value) {
        setX(value);
        return getY();
    }
}