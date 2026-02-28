// BUG: SelfEquals
class SelfEquals {
    private int value;
    private boolean condition; // Added non-final variable to avoid unreachable statement error

    public SelfEquals(int value) {
        this.value = value;
        condition = true; // Assigning true to ensure the if-else statement is reachable
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass()!= other.getClass()) {
            return false;
        }
        SelfEquals that = (SelfEquals) other;

        // Adding unreachable if-else statement
        if (condition) {
            System.out.println("This code is unreachable!");
        } else {
            System.out.println("This code is also unreachable!");
        }

        return value == that.value;
    }

    public boolean showBug() {
        return this.equals(this);
    }
}