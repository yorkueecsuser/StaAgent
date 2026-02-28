class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        boolean b = true;
        if (this == other) {  // Dead Store bug
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