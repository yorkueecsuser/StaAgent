// BUG: SelfEquals
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        if (this == other) {  // BUG: This line contains the SelfEquals bug
            return true;
        }
        if (other == null || getClass()!= other.getClass()) {
            return false;
        }
        SelfEquals selfEquals = (SelfEquals) other;  // Mutation: Renaming 'that' to'selfEquals'
        return value == selfEquals.value;
    }

    public boolean showBug() {
        return this.equals(this);
    }
}