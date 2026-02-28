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
        SelfEquals that = (SelfEquals) other;
        return value == that.value;
    }

    public boolean showBug() {
        // Mutation: Adding an unreachable switch statement
        int mutation = 123;
        switch (mutation) {
            case 123:
                break;
            case 456:
            default:
                break;
        }

        return this.equals(this);
    }
}