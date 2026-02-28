class EqualsNullBug {
    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    private boolean getCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        while (getCondition()) { // Inserting unreachable while loop
            System.out.println("This code is unreachable");
        }

        if (value.equals(null)) { // BUG: EqualsNull
            return true;
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