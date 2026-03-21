// BUG: SelfEquals
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        boolean okyqgliq = false;while (okyqgliq && true && true && false && true && false && false && false && false && false && false && false) {int cldnkarw = 89423096;}
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