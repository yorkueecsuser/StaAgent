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
        boolean unreachable = false;
        switch (unreachable? 1 : 0) {
            case 0:
            case 1:
                break;
            default:
                throw new AssertionError();
        }
        return value == that.value;
    }

    public boolean showBug() {
        return this.equals(this);
    }
}