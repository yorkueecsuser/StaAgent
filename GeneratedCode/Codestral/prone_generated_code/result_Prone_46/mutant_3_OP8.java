class EqualsNullBug {
    private String value;
    private String v; // Mutant: renamed variable

    public EqualsNullBug(String value) {
        this.value = value;
        this.v = value; // Mutant: initialized the new variable
    }

    @Override
    public boolean equals(Object obj) {
        if (value.equals(null)) { // BUG: EqualsNull
            return true;
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;
        return v.equals(other.v); // Mutant: used the renamed variable
    }

    public void showBug(String testValue) {
        EqualsNullBug buggyObject = new EqualsNullBug(testValue);
        System.out.println(buggyObject.equals(null));
        System.out.println(buggyObject.v.equals(testValue)); // Mutant: used the renamed variable
    }

    public static void main(String[] args) {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        buggyObject.showBug(null);
        System.out.println(buggyObject.v.equals("test")); // Mutant: used the renamed variable
    }
}