// BUG: SelfEquals
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        boolean cywmxzun = false;while (cywmxzun && false && true && false && true && false && false && false && true && false && true && false) {float coogcrxd = 634546528;}
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