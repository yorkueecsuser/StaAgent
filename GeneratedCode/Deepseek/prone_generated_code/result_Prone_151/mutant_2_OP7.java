// BUG: SelfEquals (Mutated)
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        if (this == other) {  // BUG: This line contains the SelfEquals bug
            return false; // mutated line
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