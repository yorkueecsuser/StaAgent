class EqualsNullBug {
    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (value.equals(null)) {
            return true;
        }
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code block");
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