class EqualBugExample {
    private String name;

    public EqualBugExample(String name) {
        this.name = name;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;

        // Mutant: Unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            System.out.println("This line is never executed");
        }

        return name!= null? name.equals(that.name) : that.name == null;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }

    // Method to return false for the unreachable if statement
    private boolean getCondition() {
        return false;
    }
}