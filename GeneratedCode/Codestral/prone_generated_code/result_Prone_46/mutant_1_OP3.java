class EqualsNullBug {
    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    private boolean getUnreachableCondition() {
        return false; // The condition is always false to make it unreachable
    }

    @Override
    public boolean equals(Object obj) {
        if (value.equals(null)) { // BUG: EqualsNull
            return true;
        }
        if (getUnreachableCondition()) { // Mutant: Unreachable if statement
            System.out.println("This line should never execute.");
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;
        return value.equals(other.value);
    }

    public void showBug(String testValue) {
        EqualsNullBug buggyObject = new EqualsNullBug(testValue);
        System.out.println(buggyObject.equals(null));
    }

    public static void main(String[] args) {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        buggyObject.showBug(null);
    }
}