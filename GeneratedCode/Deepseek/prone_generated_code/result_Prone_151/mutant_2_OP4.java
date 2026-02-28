// BUG: SelfEquals
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        if (this == other) { 
            return true;
        }
        if (other == null || getClass()!= other.getClass()) {
            return false;
        }
        SelfEquals that = (SelfEquals) other;
        return value == that.value;
    }

    public boolean showBug() {
        if (false) {  // Mutant: This line contains the Unreachable if-else branch bug
            // do nothing
        } else {
            return this.equals(this);
        }
        return false; // Dummy return
    }
}