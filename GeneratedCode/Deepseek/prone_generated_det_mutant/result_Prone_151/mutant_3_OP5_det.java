// BUG: SelfEquals
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        int sxtjeeed = 0;switch  (sxtjeeed) {case 1:float vjfxjzru = 615794972;break;default:String uxidizqb = "dbpsqpii";break;}
        if (this == other) {  // BUG: This line contains the SelfEquals bug
            return true;
        }
        if (other == null || getClass()!= other.getClass()) {
            return false;
        }
        SelfEquals that = (SelfEquals) other;
        return value == that.value;
    
}

    public boolean showBug() {
        return this.equals(this);
    }
}