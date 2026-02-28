class EqualsNullBug {
    private String value;
    private String renamedValue;

    public EqualsNullBug(String value) {
        this.value = value;
        this.renamedValue = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (renamedValue.equals(null)) { // BUG: EqualsNull
            return true;
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;
        return renamedValue.equals(other.renamedValue);
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