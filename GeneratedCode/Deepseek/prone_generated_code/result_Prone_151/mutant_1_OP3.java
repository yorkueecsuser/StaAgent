class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    // MUTATED CODE START
    // This mutation replaces the line that checks if 'this' is equal to 'other' with a condition that is always false.
    // This makes the 'if' block unreachable, ensuring that the 'if' block can never be executed.
    public boolean equals(Object other) {
        if (this == other && false) {  // MUTATION: adding unreachable 'if' condition
            return true;
        }
        if (other == null || getClass()!= other.getClass()) {
            return false;
        }
        SelfEquals that = (SelfEquals) other;
        return value == that.value;
    }

    // MUTATED CODE END

    public boolean showBug() {
        return this.equals(this);
    }
}